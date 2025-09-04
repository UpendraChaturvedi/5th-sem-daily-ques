// Last updated: 9/4/2025, 12:02:31 PM
class Solution {
    public int shipWithinDays(int[] w, int d) {
        int s=0;
        int ans=0;
        int mx=Integer.MIN_VALUE;
        for(int i:w){
            mx=Math.max(i,mx);
            s+=i;
        }
        int l=mx;
        int h=s;
        while(l<=h){
            int m=l+(h-l)/2;
            if(ispossible(w,d,m)){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
        
    }
    public static boolean ispossible(int []w,int d,int m){
        int l=0;
        int days=1;
        for(int i:w){
            if(i+l<=m){
                l+=i;
            }
            else{
                l=i;
                days++;
            }
        }
        return d>=days;
    }
}