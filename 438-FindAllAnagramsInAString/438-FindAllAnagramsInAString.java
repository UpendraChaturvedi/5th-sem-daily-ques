// Last updated: 9/4/2025, 12:05:03 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if (n < m) return result;
        char[] sort2 = p.toCharArray();
        Arrays.sort(sort2);
        for (int i = 0; i <= n - m; i++) {
            String s1 = s.substring(i, i + m);
            char[] sort1 = s1.toCharArray();
            Arrays.sort(sort1);
            String s3 = new String(sort1);
            String s4 = new String(sort2);
            if (s3.equals(s4)) {
                result.add(i);
            }
        }
        return result;
    }
}