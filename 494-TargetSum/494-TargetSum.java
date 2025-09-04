// Last updated: 9/4/2025, 12:04:40 PM
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int r=way(nums,0,0,target);
        return r;
    }
    public static int way(int []nums,int i,int s,int t){
        if (i == nums.length) { 
            return s == t ? 1 : 0;
        }
        int p=way(nums,i+1,s+nums[i],t);
        int m=way(nums,i+1,s-nums[i],t);
        return p+m;
    }
}