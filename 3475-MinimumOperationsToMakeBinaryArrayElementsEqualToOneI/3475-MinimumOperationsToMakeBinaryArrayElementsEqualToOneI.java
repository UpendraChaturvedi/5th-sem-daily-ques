// Last updated: 9/4/2025, 11:58:52 AM
class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                for(int j=i;j<i+3;j++){
                    nums[j]=1-nums[j];
                }
                c++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return -1;
            }
        }
        return c;
        
    }
}