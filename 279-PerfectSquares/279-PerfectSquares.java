// Last updated: 9/4/2025, 12:05:52 PM
class Solution {
    public int numSquares(int n) {
        int dp[]=new int [n+1];
        Arrays.fill(dp,-1);
        return perfectSquares(n,dp);
    }
    public static boolean isperfect(int i){
        int sqrt=(int)Math.sqrt(i);
        return sqrt*sqrt==i;
    }
    public int perfectSquares(int n,int dp[]){
        int min=Integer.MAX_VALUE;
        if(n==0) return 0;
        if(isperfect(n)) return 1;
        if(dp[n]!=-1) return dp[n];
        for(int i=1;i*i<n;i++){
            int c=perfectSquares(i*i,dp)+perfectSquares(n-i*i,dp);
            min=Math.min(min,c);
            dp[n]=min;
        }
        return dp[n];
    }

}