// Last updated: 10/23/2025, 8:44:45 PM
class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int len=2;
        int ans=0;
        int n=nums.length;
        int fir=nums[0];
        int sec=nums[1];
        for(int i=2;i<n;i++){
            if(nums[i]==fir+sec){
                len++;
                ans=Math.max(len,ans);
                fir=nums[i];
                sec=nums[i-1];
            }
            else{
                fir=nums[i];
                sec=nums[i-1];
                len=2;
            }
        }
        return Math.max(ans,len);
    }
}