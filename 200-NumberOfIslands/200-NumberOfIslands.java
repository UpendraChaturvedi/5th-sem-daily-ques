// Last updated: 9/4/2025, 12:06:29 PM
class Solution {
    public int numIslands(char[][] g) {
        int n=g.length;
        int m=g[0].length;
        int c=0;
        int vis[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]=='1' && vis[i][j]==0){
                    dfs(g,i,j,vis);
                    c++;
                }
            }
           
        }
        return c;
    }
        public static void dfs(char g[][],int sr,int sc,int [][]vis){
            if(sr<0 ||sc<0 || sr>=g.length || sc>=g[0].length || vis[sr][sc]==1 || g[sr][sc]=='0'){
                return ;
            }
            vis[sr][sc]=1;
            dfs(g,sr-1,sc,vis);
            dfs(g,sr+1,sc,vis);
            dfs(g,sr,sc+1,vis);
            dfs(g,sr,sc-1,vis);
        }
        
    
}