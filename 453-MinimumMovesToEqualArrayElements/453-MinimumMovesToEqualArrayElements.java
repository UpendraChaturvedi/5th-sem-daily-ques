// Last updated: 9/4/2025, 12:04:51 PM
class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            min=Math.min(i,min);
        }
        int res=0;
        for(int i:nums){
            res+=(i-min);
        }
        return res;
    }
}