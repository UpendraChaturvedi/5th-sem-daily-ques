// Last updated: 9/4/2025, 12:04:48 PM
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length/2;
        int res=0;
        for(int i:nums){
            res+=Math.abs(i-nums[n]);
        }
        return res;
    }
}