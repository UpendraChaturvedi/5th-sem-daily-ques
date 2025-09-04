// Last updated: 9/4/2025, 11:58:48 AM
class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            int s=0;
            while(t>0){
                s+=t%10;
                t=t/10;
            }
            nums[i]=s;
        }
        int m=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        m=Math.min(m,nums[i]);
       }
       return m;
        
    }
}