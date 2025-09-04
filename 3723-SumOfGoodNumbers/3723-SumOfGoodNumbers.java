// Last updated: 9/4/2025, 11:58:37 AM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int s = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if ((i - k < 0 || nums[i] > nums[i - k]) && (i + k >= n || nums[i] > nums[i + k])) {
                s += nums[i];
            }
        }
        
        return s;
    }
}
