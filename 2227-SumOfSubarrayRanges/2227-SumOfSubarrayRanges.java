// Last updated: 9/4/2025, 12:00:15 PM
class Solution {
    public long subArrayRanges(int[] nums) {
        long s=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int max=nums[i];
            int min=nums[i];
            for(int j=i;j<n;j++){
                max=Math.max(max,nums[j]);
                min=Math.min(min,nums[j]);
                s+=max-min;
            }
            
        } 
        return s; 
    }
}