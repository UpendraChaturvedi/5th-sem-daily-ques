// Last updated: 9/4/2025, 12:04:42 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int m=0;
        for(long a:nums){
            if(a==1){
                c++;
            }
            else{
                
                m=Math.max(m,c);
                c=0;
            }
        }
        return Math.max(m,c);
        
    }
}