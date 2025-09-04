// Last updated: 9/4/2025, 12:01:23 PM
class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int[] left = new int[n];
        int[] right = new int[n];
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            seen.add(s.charAt(i));
            left[i] = seen.size();
        }
        seen.clear();
        for (int i = n - 1; i >= 0; i--) {
            seen.add(s.charAt(i));
            right[i] = seen.size();
        }
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            if (left[i] == right[i + 1]) {
                res++;
            }
        }

        return res;
    }
}
