// Last updated: 9/4/2025, 12:04:43 PM
class Solution {
    public int totalHammingDistance(int[] nums) {
        int s=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int xor = nums[i] ^ nums[j];
                s += Integer.bitCount(xor);
                
            }
        }
        return s;
    }
}