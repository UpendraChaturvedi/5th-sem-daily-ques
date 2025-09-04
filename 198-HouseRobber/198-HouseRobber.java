// Last updated: 9/4/2025, 12:06:31 PM
class Solution {
    public int rob(int[] nums) {
        int dp[]=new int [nums.length+1];
        Arrays.fill(dp,-1);
        return gen(nums,0,dp);
        
    }
    public static int gen(int []nums,int i,int []dp){
        if(i>=nums.length )return 0;
        if(dp[i]!=-1) return dp[i];
        int max1=nums[i]+gen(nums,i+2,dp);
        int max2=gen(nums,i+1,dp);
        return dp[i]=Math.max(max1,max2);
    }
}