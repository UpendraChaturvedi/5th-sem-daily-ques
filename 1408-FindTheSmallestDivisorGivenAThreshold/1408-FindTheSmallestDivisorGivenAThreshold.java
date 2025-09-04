// Last updated: 9/4/2025, 12:01:49 PM
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int h=0;
        for(int i:nums){
            h=Math.max(i,h);
        }
        int ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(ispossible(nums,threshold,m)){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    public static boolean ispossible(int []nums,int thr,int m){
        int s=0;
        for(int i:nums){
            s+=(int)Math.ceil((double)i/m);
        }
        return s<=thr;
    }
}