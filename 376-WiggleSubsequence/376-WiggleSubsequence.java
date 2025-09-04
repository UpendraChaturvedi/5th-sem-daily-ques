// Last updated: 9/4/2025, 12:05:22 PM
class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) return nums.length;
        int prevdiff=0;
        int c=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            int currdiff=nums[i]-nums[i-1];
            if(currdiff>0 && prevdiff<=0 ||currdiff<0 && prevdiff>=0){
                c++;
                prevdiff=currdiff;
            }
        }
        return c;
    }
}