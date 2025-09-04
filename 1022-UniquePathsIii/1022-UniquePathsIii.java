// Last updated: 9/4/2025, 12:02:37 PM
class Solution {
    public int uniquePathsIII(int[][] g) {
        int [][]vis=new int [g.length][g[0].length];
        int sr=0;
        int sc=0;
        int e=1;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==1){
                    sr=i;
                    sc=j;
                }
                else if (g[i][j] == 0) {
                    e++;  
                }
            }
        }
        return way(g,sr,sc,vis,e);
    }
    public static int way(int [][]g,int s,int c,int [][]vis,int e){
        if(s<0 || c<0 || s>=g.length || c>=g[0].length || g[s][c]==-1 || vis[s][c]==1){
            return 0;
        }
        if (g[s][c] == 2) {
            return e == 0 ? 1 : 0; 
        }
        vis[s][c]=1;
        int w1=way(g,s+1,c,vis,e-1);
        int w2=way(g,s-1,c,vis,e-1);
        int w3=way(g,s,c+1,vis,e-1);
        int w4=way(g,s,c-1,vis,e-1);
        vis[s][c]=0;
        return w1+w2+w3+w4;
    }
}