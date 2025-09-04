// Last updated: 9/4/2025, 12:03:38 PM
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> built = new HashSet<>();
        String ans = "";
        built.add("");
        for (String word : words) {
            if (built.contains(word.substring(0, word.length() - 1))) {
                built.add(word);
                if (word.length() > ans.length()) {
                    ans = word;
                }
            }
        }
        return ans;
    }
}
