// Last updated: 9/4/2025, 12:03:41 PM
class Solution {
    public int maxAreaOfIsland(int[][] g) {
        int res=0;
        int vis[][]=new int [g.length][g[0].length];
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==1){
                    res=Math.max(res,gen(g,i,j,vis));
                }
            }
        }
        return res;
        
    }
    public static int gen(int g[][],int sr,int sc,int vis[][]){
        if(sr<0 || sc<0 || sr>=g.length || sc>=g[0].length || (vis[sr][sc]==1) || g[sr][sc]==0){
            return 0;
        }
        vis[sr][sc]=1;
        int u=gen(g,sr-1,sc,vis);
        int r=gen(g,sr,sc+1,vis);
        int d=gen(g,sr+1,sc,vis);
        int l=gen(g,sr,sc-1,vis);
        return 1+u+r+d+l;
    }
}