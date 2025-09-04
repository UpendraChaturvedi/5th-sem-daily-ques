// Last updated: 9/4/2025, 11:58:17 AM
class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                h1.put(c, h1.getOrDefault(c, 0) + 1);
            } else {
                h2.put(c, h2.getOrDefault(c, 0) + 1);
            }
        }
        int mv = 0;
        int mc = 0;
        for (Character c : h1.keySet()) {
            mv = Math.max(mv, h1.get(c));
        }
        for (Character c : h2.keySet()) {
            mc = Math.max(mc, h2.get(c));
        }
        return mc + mv;
    }
}
