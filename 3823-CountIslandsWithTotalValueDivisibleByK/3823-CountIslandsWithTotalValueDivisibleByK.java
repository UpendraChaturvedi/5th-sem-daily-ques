// Last updated: 9/4/2025, 11:58:26 AM
class Solution {
    static int dirs[][]={{-1,0},{1,0},{0,-1},{0,1}};
    public int countIslands(int[][] g, int k) {
        int n=g.length;
        int m=g[0].length;
        int c=0;
        boolean vis[][]=new boolean [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && g[i][j]!=0){
                    int s=dfs(g,k,i,j,vis);
                    if(s%k==0){
                        c++;
                    }
                }
                
            }
        }
        return c;
    }
    public static int dfs(int [][]g,int k,int i,int j,boolean [][]vis){
        if(i>g.length-1 || i<0 || j>g[0].length-1||j<0 || vis[i][j]==true|| g[i][j]==0){
            return 0;
        }
        vis[i][j]=true;
        int sum=g[i][j];
        for(int []dir:dirs){
            int nx=i+dir[0];
            int ny=j+dir[1];
            sum+=dfs(g,k,nx,ny,vis);
        }
        return sum;

    }
}