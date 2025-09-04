// Last updated: 9/4/2025, 11:58:58 AM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    c=c^nums[i];
                }
            }
        }
        return c;
        
    }
}