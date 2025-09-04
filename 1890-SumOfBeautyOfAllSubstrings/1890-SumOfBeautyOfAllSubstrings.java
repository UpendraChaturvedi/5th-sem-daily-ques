// Last updated: 9/4/2025, 12:00:52 PM
class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> h = new HashMap<>();
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                h.put(ch, h.getOrDefault(ch, 0) + 1);
                int max = 0, min = Integer.MAX_VALUE;
                for (int freq : h.values()) {
                    max = Math.max(max, freq);
                    min = Math.min(min, freq);
                }

                sum += (max - min);
            }
        }

        return sum;
    }
}

        
