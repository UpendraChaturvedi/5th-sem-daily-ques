// Last updated: 9/4/2025, 12:07:57 PM
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n]; 
        return count(0, 0, m, n, dp);
    }

    public int count(int s, int e, int m, int n, int[][] dp) {
        if (s >= m || e >= n) return 0; 
        if (s == m - 1 && e == n - 1) return 1; 
        
        if (dp[s][e] != 0) return dp[s][e];

        dp[s][e] = count(s + 1, e, m, n, dp) + count(s, e + 1, m, n, dp);
        return dp[s][e];
    }
}
