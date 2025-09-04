// Last updated: 9/4/2025, 12:03:37 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int lf[]=new int [n];
        lf[0]=nums[0];
        int rf[]=new int [n];
        rf[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            lf[i]=nums[i]+lf[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rf[i]=nums[i]+rf[i+1];
        }
        for(int i=0;i<n;i++){
            if(lf[i]==rf[i]) return i;
        }
        return -1;
    }
}