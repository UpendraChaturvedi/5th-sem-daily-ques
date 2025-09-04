// Last updated: 9/4/2025, 12:06:20 PM
class Solution {
    public int minSubArrayLen(int tar, int[] nums) {
        int i=0,j=0,n=nums.length,s=0;
        int len=Integer.MAX_VALUE;
        while(j<n){
            s+=nums[j];
            if(s<tar){
                j++;
            }
            else{
            while(i<n && s>=tar){
                s-=nums[i];
                len=Math.min(len,j-i+1);
                i++;
            }
            j++;
            }
            
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}