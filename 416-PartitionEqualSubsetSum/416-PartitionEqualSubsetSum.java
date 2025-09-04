// Last updated: 9/4/2025, 12:05:08 PM
class Solution {
    public boolean canPartition(int[] nums) {
        int tot = 0;
        for (int i : nums) {
            tot += i;
        }
        if (tot % 2 != 0) {
            return false;
        }
        int target = tot / 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];
        return gen(nums, target, 0, 0, dp);
    }

    public static boolean gen(int nums[], int tot, int i, int s, Boolean[][] dp) {
        if (s > tot) {
            return false;
        }
        if (s == tot) {
            return true;
        }
        if (i >= nums.length) {
            return false;
        }
        if (dp[i][s] != null) {
            return dp[i][s];
        }
        dp[i][s] = gen(nums, tot, i + 1, s + nums[i], dp) || gen(nums, tot, i + 1, s, dp);
        return dp[i][s];
    }
}
