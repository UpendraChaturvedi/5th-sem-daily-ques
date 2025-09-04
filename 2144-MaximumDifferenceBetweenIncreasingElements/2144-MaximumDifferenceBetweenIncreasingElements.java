// Last updated: 9/4/2025, 12:00:22 PM
class Solution {
    public int maximumDifference(int[] nums) {
        int diff=-1;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]) diff=Math.max(diff,nums[j]-nums[i]);
            }
        }
        return diff;
    }
}