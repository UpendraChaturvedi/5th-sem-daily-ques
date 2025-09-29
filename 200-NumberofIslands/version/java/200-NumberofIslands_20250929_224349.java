// Last updated: 9/29/2025, 10:43:49 PM
class Solution {
    public int numIslands(char[][] g) {
        int m=g.length;
        int n=g[0].length;
        boolean vis[][]=new boolean [m][n];
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j]&& g[i][j] == '1'){
                    dfs(g,i,j,vis);
                    c++;
                }
            }
        }
        return c;
    }
    public static void dfs(char [][]g,int i,int j,boolean vis[][]){
        if(i<0 || j<0 || i>=g.length || j>=g[0].length || vis[i][j]==true || g[i][j]=='0'){
            return ;
        }
        vis[i][j]=true;
        dfs(g,i+1,j,vis);
        dfs(g,i-1,j,vis);
        dfs(g,i,j+1,vis);
        dfs(g,i,j-1,vis);
    }
}