// Last updated: 9/4/2025, 12:00:18 PM
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            if (h.containsKey(word1.charAt(i))) {
                h.put(word1.charAt(i), h.get(word1.charAt(i)) + 1);
            } else {
                h.put(word1.charAt(i), 1);
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            if (h.containsKey(word2.charAt(i))) {
                h.put(word2.charAt(i), h.get(word2.charAt(i)) - 1);
            } else {
                h.put(word2.charAt(i), -1);
            }
        }

        for (int i : h.values()) {
            if (Math.abs(i) > 3) {
                return false;
            }
        }

        return true;
        
    }
}