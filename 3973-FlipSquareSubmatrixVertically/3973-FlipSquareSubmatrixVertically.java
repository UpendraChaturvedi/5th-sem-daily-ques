// Last updated: 9/4/2025, 11:58:05 AM
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int l=x;
        int h=x+k-1;
        while(l<=h){
            swap(grid,x,y,l,h,k);
            l++;
            h--;
        }
        return grid;
    }
    public static void swap(int [][]grid,int x,int y,int l,int h,int k){
        for(int i=y;i<y+k;i++){
            int t=grid[l][i];
            grid[l][i]=grid[h][i];
            grid[h][i]=t;
        }
    }
    
    
}
