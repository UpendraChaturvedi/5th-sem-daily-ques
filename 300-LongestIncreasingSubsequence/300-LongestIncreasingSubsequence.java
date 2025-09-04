// Last updated: 9/4/2025, 12:05:46 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int max=-1;
        int []dp=new int [n];
        for(int i=0;i<n;i++){
            int mx=0;
            for(int j=0;j<=i-1;j++){
                if(nums[j]<nums[i]){
                    mx=Math.max(mx,dp[j]);
                    dp[i]=mx;
                }
            }
            dp[i]+=1;
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}