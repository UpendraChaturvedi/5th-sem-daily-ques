// Last updated: 9/4/2025, 11:58:16 AM
class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if (n <= k && m <= k) return 0;

        long minCost = Long.MAX_VALUE;

        if (m <= k) {
            minCost = Math.min(minCost, getMinCutCost(n, k));
        }

        if (n <= k) {
            minCost = Math.min(minCost, getMinCutCost(m, k));
        }

        return minCost;
    }

    private long getMinCutCost(int x, int k) {
        long res = Long.MAX_VALUE;

        for (int i = 1; i < x; i++) {
            int a = i, b = x - i;
            if (a <= k && b <= k) {
                res = Math.min(res, (long) a * b);
            }
        }

        return res;
    }
}
