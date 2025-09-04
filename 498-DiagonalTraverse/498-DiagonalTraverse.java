// Last updated: 9/4/2025, 12:04:38 PM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int k=0;
        int m=mat.length;
        int n=mat[0].length;
        int ans[]=new int [n*m];
        
        for(int lev=0;lev<=m+n-1;lev++){
            if(lev%2!=0){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(i+j==lev){
                        ans[k++]=mat[i][j];
                    }
                }
            }
        }
        else{
            for(int i=m-1;i>=0;i--){
                for(int j=0;j<n;j++){
                    if(i+j==lev){
                        ans[k++]=mat[i][j];
                    }
                }
            }
        }
        }
        return ans;
    }
}