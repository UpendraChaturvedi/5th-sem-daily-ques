// Last updated: 9/4/2025, 11:59:56 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        long res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c++;
                
            }
            else{
                res += (c *(c+1))/ 2;
                c=0;
            }
        }
        return res += (c * (c+1)) / 2;
    }
}