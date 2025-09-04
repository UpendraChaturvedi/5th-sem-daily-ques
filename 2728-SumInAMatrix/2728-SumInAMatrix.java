// Last updated: 9/4/2025, 11:59:28 AM
class Solution {
    public int matrixSum(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        for(int i=0;i<n;i++){
            Arrays.sort(nums[i]);
        }
        int score=0;
        for (int i = m - 1; i >= 0; i--) {
            int colmax = 0;
            for (int j = 0; j < n; j++) {
                colmax = Math.max(colmax, nums[j][i]);
            }
            score += colmax;
        }
        return score;
        
    }
}