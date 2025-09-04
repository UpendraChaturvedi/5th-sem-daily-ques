// Last updated: 9/4/2025, 12:03:36 PM
class Solution {
    public int[][] floodFill(int[][] img, int sr, int sc, int color) {
        int [][]vis=new int [img.length][img[0].length];
        int orig = img[sr][sc];
        if (orig == color) return img;
        dfs(img,sr,sc,color,orig,vis);
        return img;
        
    }
    public static void dfs(int [][]img,int sr,int sc,int color,int orig,int vis[][]){
        if(sr<0 || sc<0 ||sr>=img.length || sc>=img[0].length || vis[sr][sc]==1 || img[sr][sc]!=orig){
            return ;
        }
        vis[sr][sc]=1;
        img[sr][sc]=color;
        dfs(img,sr-1,sc,color,orig,vis);
        dfs(img,sr+1,sc,color,orig,vis);
        dfs(img,sr,sc+1,color,orig,vis);
        dfs(img,sr,sc-1,color,orig,vis);
    }
}