// Last updated: 11/26/2025, 3:44:38 PM
class Solution {
    public int equalSubstring(String s, String t, int cst) {
        int n=s.length();
        int diff[]=new int [n];
        for(int i=0;i<n;i++){
            diff[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        int sub[]=new int [n];
        sub[0]=diff[0];
        for(int i=1;i<n;i++){
            sub[i]=sub[i-1]+diff[i];
        }
        int mx=0;
        for(int i=0;i<n;i++){
            int f=find(sub,i,cst);
            if (f >= i) {
                mx = Math.max(mx, f - i + 1);
            }
        }
        return mx;
    }
    public static int find(int []sub,int i,int cst){
        int l=i;
        int h=sub.length-1;
        int ans=i-1;
        while(l<=h){
            int m=l+(h-l)/2;
             int cost = sub[m] - (i > 0 ? sub[i-1] : 0);
            if(cost>cst){
                h=m-1;
            }
            else{
                ans=m;
                l=m+1;
            }
        }
        return ans;
    }
}