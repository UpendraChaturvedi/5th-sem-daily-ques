// Last updated: 9/4/2025, 12:05:56 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=0;
        int su=0;
        for(int i=0;i<n;i++){
            
            s+=nums[i];
            su+=i;
        }
        su+=n;
        return su-s;
        
    }
}