// Last updated: 9/4/2025, 12:08:27 PM
class Solution {
    public int search(int[] nums, int tar) {
        int l=0;
        int n=nums.length;
        int h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==tar) return m;
            if(nums[l]<=nums[m]){
                if(nums[l]<=tar&& tar<=nums[m]){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(tar>=nums[m] && tar<=nums[h]){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
        }
        return -1;
    }
}