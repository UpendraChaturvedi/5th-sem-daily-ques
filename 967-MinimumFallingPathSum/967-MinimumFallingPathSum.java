// Last updated: 9/4/2025, 12:02:50 PM
class Solution {
    public int minFallingPathSum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int dp[][]=new int [n][m];
        for(int i=0;i<m;i++){
            dp[0][i]=mat[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0)dp[i][j]=Math.min(mat[i][j]+dp[i-1][j],mat[i][j]+dp[i-1][j+1]);
                else if(j==m-1)dp[i][j]=Math.min(mat[i][j]+dp[i-1][j],mat[i][j]+dp[i-1][j-1]);
                else{
                    dp[i][j]=Math.min(mat[i][j]+dp[i-1][j],Math.min(mat[i][j]+dp[i-1][j+1],mat[i][j]+dp[i-1][j-1]));
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            min=Math.min(dp[n-1][j],min);
        }
        return min;
    }
}