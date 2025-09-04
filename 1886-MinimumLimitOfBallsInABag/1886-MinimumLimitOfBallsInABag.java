// Last updated: 9/4/2025, 12:00:55 PM
class Solution {
    public int minimumSize(int[] nums, int maxopr) {
        int ans=-1;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(i,max);
        }
        int l=1;
        int h=max;
        while(l<=h){
            int m=l+(h-l)/2;
            int split=0;
            for(int i:nums){
                if(i>=m){
                    split+=Math.floor((i-1)/m);
                }
            }
            if(split<=maxopr){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}