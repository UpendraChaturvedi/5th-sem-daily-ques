// Last updated: 9/4/2025, 11:58:10 AM
class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n-1  && nums[i]<nums[i+1]){
            i++;
        }
        int ind=i;
        if(ind==0 || ind>=n-2) return false;
        int ind1=0;
        while(i<n-1  && nums[i]>nums[i+1]){
            i++;
        }
        ind1=i;
        if(ind1==ind || ind1>=n-1) return false;
        while(i<n-1 && nums[i]<nums[i+1]){
            i++;
        }
        return i==n-1;
    }
}