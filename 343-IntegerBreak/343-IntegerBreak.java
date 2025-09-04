// Last updated: 9/4/2025, 12:05:33 PM
class Solution {
    public int integerBreak(int n) {
        int dp[][]=new int [n][n+1];
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                if(i<=j){
                    dp[i][j] = Math.max(dp[i - 1][j],Math.max(i * (j - i), i*dp[i][j - i]));
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n-1][n];
    }
    // public static int dfs(int n)
}