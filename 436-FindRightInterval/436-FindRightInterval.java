// Last updated: 9/4/2025, 12:05:05 PM
class Solution {
    public int[] findRightInterval(int[][] inter) {
        int n = inter.length;
        int[] arr = new int[n];
        int[][] withIndex = new int[n][3];
        for (int i = 0; i < n; i++) {
            withIndex[i][0] = inter[i][0];
            withIndex[i][1] = inter[i][1];
            withIndex[i][2] = i;
        }
        Arrays.sort(withIndex, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            int end = withIndex[i][1];
            int l = 0, h = n - 1;
            int gt = -1;
            while (l <= h) {
                int m = l + (h - l) / 2;
                if (withIndex[m][0] >= end) {
                    gt = withIndex[m][2];
                    h = m - 1;
                } else {
                    l = m + 1;
                }
            }
            arr[withIndex[i][2]] = gt;
        }
        return arr;
        
    }
}