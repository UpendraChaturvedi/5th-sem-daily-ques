// Last updated: 9/4/2025, 12:02:24 PM
class Solution {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public int numEnclaves(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        boolean vis[][]=new boolean [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || j==0 || i==n-1 || j==m-1)&&g[i][j]==1 &&!vis[i][j]){
                    dfs(g,vis,i,j);
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]==1 && !vis[i][j]) c++;
            }
        }
        return c;
    }
    public static void dfs(int [][]g,boolean vis[][],int i,int j){
        int n=g.length;
        int m=g[0].length;
        if(i<0 || j<0 || i>n-1 || j>m-1 ||vis[i][j] ||g[i][j]==0) return ;
        vis[i][j]=true;
        for(int []dir:dirs){
            int nr=i+dir[0];
            int nc=j+dir[1];
            dfs(g,vis,nr,nc);
        }
    }
}