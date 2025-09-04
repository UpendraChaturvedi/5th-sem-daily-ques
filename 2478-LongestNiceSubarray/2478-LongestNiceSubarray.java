// Last updated: 9/4/2025, 11:59:51 AM
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int res = 0, j = 0, a = 0, n = nums.length;
        
        for (int i = 0; i < n; i++) {
            while (j < n && (a & nums[j]) == 0) { 
                a |= nums[j];
                j++;
            }
            
            res = Math.max(res, j - i); 
            
            a ^= nums[i]; 
        }
        
        return res;
        
    }
}