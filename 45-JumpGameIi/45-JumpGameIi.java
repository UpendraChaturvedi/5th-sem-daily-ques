// Last updated: 9/4/2025, 12:08:15 PM
class Solution {
    public int jump(int[] nums) {
        int dp[]=new int [nums.length];
        Arrays.fill(dp, -1);
        return gen(nums,0,dp);
    }
    public static int gen(int []nums,int i,int []dp){
        if(i>=nums.length-1) return 0;
        if(nums[i]==0) return Integer.MAX_VALUE;
        if (dp[i] != -1) return dp[i];
        int minjmp=Integer.MAX_VALUE;
        for(int j=1;j<=nums[i];j++){
            int next=gen(nums,i+j,dp);
            if(next!=Integer.MAX_VALUE) minjmp=Math.min(minjmp, 1 + next);
        }
        return dp[i]=minjmp;
    }
}