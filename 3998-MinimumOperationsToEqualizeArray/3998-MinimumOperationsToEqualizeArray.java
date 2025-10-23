// Last updated: 10/23/2025, 8:44:48 PM
class Solution {
    public int minOperations(int[] nums) {
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=nums[0]) return 1;
        }
        return 0;
    }
}