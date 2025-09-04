// Last updated: 9/4/2025, 12:07:48 PM
class Solution {
    public void setZeroes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int rw[]=new int [m];
        int cw[]=new int [n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                rw[i]=1;
                cw[j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(rw[i]==1){
                for(int j=0;j<n;j++){
                    mat[i][j]=0;
                }
            }
        }
        for (int j=0;j<n;j++) {
            if (cw[j]==1) {
                for (int i=0; i< m;i++) {
                    mat[i][j]=0;
                }
            }
        }

    }
}