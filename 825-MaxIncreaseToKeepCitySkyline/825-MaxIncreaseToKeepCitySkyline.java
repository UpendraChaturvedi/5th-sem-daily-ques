// Last updated: 9/4/2025, 12:03:11 PM
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] g) {
        int n=g.length;
        int colmax[]=new int [n];
        int rowmax[]=new int [n];
        int s=0;
        for(int i=0;i<n;i++){
            int rm=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                rm=Math.max(rm,g[i][j]);
            }
            rowmax[i]=rm;
        }
        for(int i=0;i<n;i++){
            int rc=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                rc=Math.max(rc,g[j][i]);
            }
            colmax[i]=rc;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int min=Math.min(colmax[j],rowmax[i]);
                s+=(min-g[i][j]);
            }
        }
        return s;
    }
}