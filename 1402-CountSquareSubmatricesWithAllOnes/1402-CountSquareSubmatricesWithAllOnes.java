// Last updated: 9/4/2025, 12:01:51 PM
class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    dp[i][j]=matrix[i][j];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                   if(i-1>=0 && j-1>=0){
                    if(matrix[i][j]!=0){
                        dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]));
                    }
                    else{
                        dp[i][j]=0;
                    }
                }
            }
        }
        int s=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                s+=dp[i][j];
            }
        }
        return s;
        
    }
}