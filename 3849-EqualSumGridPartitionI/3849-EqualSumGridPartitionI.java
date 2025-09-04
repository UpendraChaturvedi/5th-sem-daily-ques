// Last updated: 9/4/2025, 11:58:21 AM
class Solution {
    public boolean canPartitionGrid(int[][] g) {
        int m=g.length;
        long rsum=0;
        int n=g[0].length;
        long tsum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                tsum+=g[i][j];
            }
        }
        if(tsum%2!=0) return false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rsum+=g[i][j];
            }
            if(rsum*2==tsum) return true;
        }
        long csum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                csum+=g[j][i];
            }
            if(csum*2==tsum) return true;
        }
        return false;
    }
}