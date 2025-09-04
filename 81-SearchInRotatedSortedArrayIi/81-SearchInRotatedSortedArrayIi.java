// Last updated: 9/4/2025, 12:07:42 PM
class Solution {
    public boolean search(int[] nums, int tar) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==tar) return true;
            if (nums[l] == nums[m]) {
                l++;
                continue;
            }
            if(nums[l]<=nums[m]){
                if(nums[l]<=tar && nums[m]>=tar){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(nums[m]<=tar && nums[h]>=tar){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
        }
        return false;
    }
}