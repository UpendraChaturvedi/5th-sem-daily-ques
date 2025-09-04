// Last updated: 9/4/2025, 12:04:53 PM
class Solution {
    public String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character, Integer> h = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        List<Character> l = new ArrayList<>(h.keySet());
        l.sort((ob1, ob2) -> h.get(ob2) - h.get(ob1));

        for (char ch : l) {
            for (int i = 0; i < h.get(ch); i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
        
    }
}