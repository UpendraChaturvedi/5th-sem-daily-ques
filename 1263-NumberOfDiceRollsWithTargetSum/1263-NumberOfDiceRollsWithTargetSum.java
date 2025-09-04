// Last updated: 9/4/2025, 12:02:01 PM
class Solution {
    public int numRollsToTarget(int n, int k, int tar) {
        int dp[][]=new int [n+1][tar+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return gen(n,k,tar,dp);
    }
    public static int gen(int n,int k,int t,int dp[][]){
        if(t==0 && n==0) return 1;
        if(n<0 || t<0) return 0;
        if(dp[n][t]!=-1) return dp[n][t];
        int ways=0;
        for(int i=1;i<=k;i++){
            ways=(ways+gen(n-1,k,t-i,dp))%1000000007;
        }
        return dp[n][t]=ways;
    }
}