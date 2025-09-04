// Last updated: 9/4/2025, 12:05:36 PM
class Solution {
    static int dirs[][]={{-1,0},{1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int dp[][]=new int [m][n];
        int lm=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            lm=Math.max(lm,dfs(mat,i,j,m-1,n-1,dp));
        }
        return lm;
    }
    public static int dfs(int [][]mat ,int i,int j,int m,int n,int [][]dp){
        int len=1;
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        for(int []dir:dirs){
            int nx=i+dir[0];
            int nc=j+dir[1];
            if(nx>=0 && nc>=0 && nx<=m && nc<=n && mat[nx][nc]>mat[i][j]){
                int ans=1+dfs(mat,nx,nc,m,n,dp);
                len=Math.max(len,ans);
            }
            
        }
        return dp[i][j]=len;
    }
}