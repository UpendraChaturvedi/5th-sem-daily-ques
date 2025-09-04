// Last updated: 9/4/2025, 11:58:08 AM
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int maxlen=0;
        int r=0;
        int n=nums.length;
        for(int l=0;l<n;l++){
            while(r<n && nums[r]<=(long)nums[l]*k){
                r++;
            }
            maxlen=Math.max(maxlen,r-l);
        }
        return n-maxlen;
    }
}