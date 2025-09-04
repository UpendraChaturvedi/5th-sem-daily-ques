// Last updated: 9/4/2025, 12:06:14 PM
class Solution {
    public int maximalSquare(char[][] matrix) {
        int c=0;
        int maxSize = 0;
        int mat[][]=new int [matrix.length][matrix[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(matrix[i][j]=='1'){
                    mat[i][j]=1;
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if (mat[i][j] == 1 && i > 0 && j > 0) {
                    mat[i][j] = Math.min(mat[i - 1][j], Math.min(mat[i][j - 1], mat[i - 1][j - 1])) + 1;
                }
                maxSize = Math.max(maxSize, mat[i][j]); 
            }
        }
        
        return maxSize*maxSize;
        
        
    }
}