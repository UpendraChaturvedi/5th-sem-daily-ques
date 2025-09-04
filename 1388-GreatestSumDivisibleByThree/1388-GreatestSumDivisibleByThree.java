// Last updated: 9/4/2025, 12:01:52 PM
class Solution {
    public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n + 1][3];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return gen(nums, 0, 0, dp);
    }

    public int gen(int[] nums, int i, int mod, int[][] dp) {
        if (i == nums.length) {
            return mod == 0 ? 0 : Integer.MIN_VALUE;
        }
        if (dp[i][mod] != -1) return dp[i][mod];

        // include current number
        int include = gen(nums, i + 1, (mod + nums[i]) % 3, dp);
        if (include != Integer.MIN_VALUE) {
            include += nums[i];
        }
        int exclude = gen(nums, i + 1, mod, dp);
        dp[i][mod] = Math.max(include, exclude);
        return dp[i][mod];
    }
}
