// Last updated: 9/4/2025, 12:08:24 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int n=nums.length;
        int r=n-1;
        //int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
               
            }
        }
        return l;
        
    }
}