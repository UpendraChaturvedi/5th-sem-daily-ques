// Last updated: 9/4/2025, 12:04:11 PM
class Solution {
    static final int MOD = 1_000_000_007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int [][][]dp= new int [maxMove+1][m][n];
        for (int move = 0; move <= maxMove; move++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[move][i][j] = -1;
                }
            }
        }
        return gen(m,n,maxMove,startRow,startColumn,dp);
    }
    public static int gen(int m,int n,int max,int sr,int sc,int dp[][][]){
        if((sr<0||sc<0 || sr>=m || sc>=n)){
            return 1;
        }
        if (max == 0) return 0;
        if (dp[max][sr][sc] != -1) return dp[max][sr][sc];

        int res = 0;
        res = (res + gen(m, n, max - 1, sr + 1, sc, dp)) % MOD;
        res = (res + gen(m, n, max - 1, sr - 1, sc, dp)) % MOD;
        res = (res + gen(m, n, max - 1, sr, sc + 1, dp)) % MOD;
        res = (res + gen(m, n, max - 1, sr, sc - 1, dp)) % MOD;

        return dp[max][sr][sc] = res;
    }
}