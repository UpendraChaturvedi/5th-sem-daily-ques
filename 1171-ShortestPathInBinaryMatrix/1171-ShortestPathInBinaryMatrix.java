// Last updated: 9/4/2025, 12:02:12 PM
class Solution {
    public int shortestPathBinaryMatrix(int[][] g) {
        int n=g.length;
        if(g[0][0]!=0 || g[n-1][n-1]!=0){
            return -1;
        }
        int vis[][]=new int [n][n];
        vis[0][0]=1;
        Queue<int []>q=new LinkedList<>();
        q.offer(new int[]{0,0,1});
        int direc[][]={
            {0, 1}, {1, 0}, {0, -1}, {-1, 0},
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };
        while(!q.isEmpty()){
            int []curr=q.poll();
            int r=curr[0];
            int c=curr[1];
            int l=curr[2];
            if(r==n-1 && c==n-1){
                return l;
            }
            for(int dir[]:direc){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr>=0 && nr<=n-1 && nc>=0 &&nc<=n-1 && g[nr][nc]==0 && vis[nr][nc]==0){
                    q.offer(new int[]{nr,nc,l+1});
                    vis[nr][nc]=1;
                }
            }
        }
        return -1;
    }
}