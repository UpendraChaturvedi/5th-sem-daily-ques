// Last updated: 9/4/2025, 12:06:46 PM
class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int n=nums.length;
        int h=n-1;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[l]<=nums[m]){
                ans=Math.min(nums[l],ans);
                l=m+1;
            }
            else{
                ans=Math.min(nums[m],ans);
                h=m-1;
            }
        }
        return ans;
    }
}