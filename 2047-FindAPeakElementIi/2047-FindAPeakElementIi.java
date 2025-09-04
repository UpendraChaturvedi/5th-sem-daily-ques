// Last updated: 9/4/2025, 12:00:40 PM
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int i = 0, j = 0;
        
        while (i < mat.length && j < mat[0].length) {
            if (i - 1 >= 0 && mat[i][j] < mat[i - 1][j]) {
                i = i - 1;
                continue;
            }
            if (j - 1 >= 0 && mat[i][j] < mat[i][j - 1]) {
                j = j - 1;
                continue;
            }
            if (i + 1 < mat.length && mat[i][j] < mat[i + 1][j]) {
                i = i + 1;
                continue;
            }
            if (j + 1 < mat[0].length && mat[i][j] < mat[i][j + 1]) {
                j = j + 1;
                continue;
            }
            break; // Stop when a peak is found
        }

        return new int[]{i, j};
        
    }
}