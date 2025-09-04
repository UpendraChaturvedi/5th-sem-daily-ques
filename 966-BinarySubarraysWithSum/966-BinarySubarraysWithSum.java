// Last updated: 9/4/2025, 12:02:51 PM
class Solution {
    public int numSubarraysWithSum(int[] nums, int g) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=nums[j];
                if(s==g) c++;
            }
        }
        return c;
        
    }
}