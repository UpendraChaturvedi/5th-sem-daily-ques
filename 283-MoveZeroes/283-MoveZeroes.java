// Last updated: 9/4/2025, 12:05:51 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int co=0;
        //int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[co]=nums[i];
                co++;
            }
        }
        while(co<nums.length){
            nums[co++]=0;
        }
        
        
    }
}