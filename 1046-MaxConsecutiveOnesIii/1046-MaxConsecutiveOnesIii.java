// Last updated: 9/4/2025, 12:02:34 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int diff=0;
        int l=0;
        int n=nums.length;
        int res=Integer.MIN_VALUE;
        for(int r=0;r<n;r++){
            if(nums[r]!=1){
                diff++;
            }
            while(diff>k && l<n){
                if(nums[l]==0){
                    diff--;
                }
                l++;
            }
            res=Math.max(r-l+1,res);
        }
        return res;
    }
}