// Last updated: 9/10/2025, 10:35:00 AM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int mx=1;
        int dp[]=new int [n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    mx=Math.max(mx,dp[i]);
                }
            }
        }
        return mx;
    }
}