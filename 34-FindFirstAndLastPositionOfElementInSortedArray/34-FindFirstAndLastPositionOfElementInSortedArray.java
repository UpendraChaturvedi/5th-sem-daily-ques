// Last updated: 9/4/2025, 12:08:26 PM
class Solution {
    public int[] searchRange(int[] nums, int tar) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        int ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==tar){
                ans=m;
                h=m-1;
            }
            else if(nums[m]>tar){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        l=0;
        h=n-1;
        int ans1=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==tar){
                ans1=m;
                l=m+1;
            }
            else if(nums[m]>tar){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return new int []{ans,ans1};
    }
}