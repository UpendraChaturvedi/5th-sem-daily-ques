// Last updated: 9/4/2025, 12:02:47 PM
class Solution {
    public int minIncrementForUnique(int[] nums) {
        int moves=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                moves += (nums[i-1]+1- nums[i]); 
                nums[i] = nums[i-1]+1;
            }
        }
        return moves;
    }
}