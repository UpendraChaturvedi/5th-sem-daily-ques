// Last updated: 9/4/2025, 11:58:38 AM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        boolean moveRight = true;

        for (int i = 0; i < rows; i++) {
            if (moveRight) {
                for (int j = 0; j < cols; j++) {
                    if ((i + j) % 2 == 0) {
                        result.add(grid[i][j]);
                    }
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    if ((i + j) % 2 == 0) {
                        result.add(grid[i][j]);
                    }
                }
            }
            moveRight = !moveRight;
        }

        return result;
        
    }
}