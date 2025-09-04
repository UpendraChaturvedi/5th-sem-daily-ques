// Last updated: 9/4/2025, 12:00:26 PM
class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(nums[i]-nums[j])==k) c++;
            }
        }
        return c;
        
    }
}