// Last updated: 9/4/2025, 11:58:30 AM
class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long s=0;
        for(int i=n/3;i<n;i+=2){
            s+=nums[i];
        }
        return s;
        
    }
}