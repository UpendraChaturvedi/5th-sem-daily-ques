// Last updated: 9/4/2025, 12:07:47 PM
class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int i=0;
        int j=mat[0].length-1;
        
        while(i<mat.length && j>=0){
            int f=mat[i][j];
            if(f==t){
                return true;
            }
            if(f<t){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
        
        
    }
}