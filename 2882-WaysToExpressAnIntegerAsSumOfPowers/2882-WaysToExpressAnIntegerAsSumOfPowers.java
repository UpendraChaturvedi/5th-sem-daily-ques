// Last updated: 9/4/2025, 11:59:20 AM
class Solution {
    static int MOD=1000000007;
    public int numberOfWays(int n, int x) {
        int dp[][]=new int [n+1][n+1];
        for(int []r:dp){
            Arrays.fill(r,-1);
        }
        return ways(n,x,n,1,dp);
    }
    public static int ways(int n,int x,int t,int st,int [][]dp){
        if(t==0) return 1;
        if(st>n) return 0;
        if(dp[t][st]!=-1) return dp[t][st];
        int p=(int)Math.pow(st,x);
        if(p<=t){
            int in=ways(n,x,t-p,st+1,dp);
            int ex=ways(n,x,t,st+1,dp);
            return dp[t][st]=(in+ex)%MOD;
        }
        return dp[t][st]=(ways(n,x,t,st+1,dp))%MOD;
    }
}