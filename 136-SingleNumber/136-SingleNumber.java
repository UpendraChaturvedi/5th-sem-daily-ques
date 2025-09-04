// Last updated: 9/4/2025, 12:06:58 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  
        }
        return ans;    
    }
}