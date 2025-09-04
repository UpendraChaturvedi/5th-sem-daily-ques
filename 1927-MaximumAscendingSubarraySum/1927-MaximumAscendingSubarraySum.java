// Last updated: 9/4/2025, 12:00:49 PM
class Solution {
    public int maxAscendingSum(int[] nums) {
        int s = nums[0];
        int res = s;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) { 
                s += nums[i];
            } else {
                res = Math.max(res, s);
                s = nums[i];
            }
        }
        return Math.max(res, s);
        
    }
}