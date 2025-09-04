// Last updated: 9/4/2025, 12:07:46 PM
class Solution {
    public void sortColors(int[] nums) {
        int noz=0;
        int noo=0;
        int not=0;
        for(int i:nums){
            if(i==0) noz++;
            else if(i==1) noo++;
            else not++;
        }
        int i=0;
        while(i<noz){
            nums[i++]=0;
        }
        while(i<noz+noo){
            nums[i++]=1;
        }
        while(i<nums.length){
            nums[i++]=2;
        }
        
    }
}