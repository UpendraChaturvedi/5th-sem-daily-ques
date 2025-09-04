// Last updated: 9/4/2025, 12:05:10 PM
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        int dp[]=new int [n];
        int s=0;
        for(int i=2;i<n;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                dp[i]=dp[i-1]+1;
                s+=dp[i];
            }
        }
        return s;
    }
}