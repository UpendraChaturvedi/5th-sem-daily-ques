// Last updated: 9/4/2025, 12:04:47 PM
class Solution {
    public int islandPerimeter(int[][] grid) {
        int totalPerimeter=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    totalPerimeter += 4;
                    if(i > 0 && grid[i - 1][j] == 1)
                        totalPerimeter -= 2;
                    if(j > 0 && grid[i][j - 1] == 1)
                        totalPerimeter -= 2;
                    
                }
            }
        }
        return totalPerimeter;
        
    }

}