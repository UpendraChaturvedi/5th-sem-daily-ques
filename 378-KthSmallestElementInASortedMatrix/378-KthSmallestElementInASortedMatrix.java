// Last updated: 9/4/2025, 12:05:21 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] l = new int[matrix.length * matrix[0].length];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                l[index++] = matrix[i][j];  
            }
        }

        Arrays.sort(l); 

        return l[k - 1]; 
        
    }
}