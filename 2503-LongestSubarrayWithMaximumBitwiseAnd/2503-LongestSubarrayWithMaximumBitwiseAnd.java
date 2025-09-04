// Last updated: 9/4/2025, 11:59:46 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int n=nums.length;
        int len=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==max){
                c++;
                len=Math.max(len,c);
            }
            else{
                c=0;
            }
        }
        return len;
    }
}