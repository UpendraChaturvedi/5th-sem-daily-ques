// Last updated: 9/4/2025, 12:07:56 PM
class Solution {
    public int uniquePathsWithObstacles(int[][] g) {
        int dp[][]=new int [g.length][g[0].length];
       
        return ways(g,0,0,g.length-1,g[0].length-1,dp);
    }
    public static int ways(int [][]g,int s,int c,int er,int ec,int [][]dp){
        if(s<0 || c<0 || s>er || c>ec || g[s][c]==1){
            return 0;
        }
        if(s==er && c==ec){
            return 1;
        }
        if(dp[s][c]!=0){
            return dp[s][c];
        }
        int w1=ways(g,s+1,c,er,ec,dp);
        int w2=ways(g,s,c+1,er,ec,dp);
        dp[s][c]=w1+w2;
        return dp[s][c];
    }
}