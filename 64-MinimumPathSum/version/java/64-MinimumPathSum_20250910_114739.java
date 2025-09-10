// Last updated: 9/10/2025, 11:47:39 AM
class Solution {
    public int minPathSum(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        int dp[][]=new int [n+1][m+1];
        dp[0][0]=g[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) continue;
                else if(i==0) dp[i][j]=dp[i][j-1]+g[i][j];
                else if(j==0) dp[i][j]=dp[i-1][j]+g[i][j];
                else{
                    dp[i][j]=Math.min(dp[i-1][j]+g[i][j],dp[i][j-1]+g[i][j]);
                }
            }
        }
        return dp[n-1][m-1];
    }
}