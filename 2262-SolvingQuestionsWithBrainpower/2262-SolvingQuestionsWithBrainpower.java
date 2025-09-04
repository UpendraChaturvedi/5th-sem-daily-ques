// Last updated: 9/4/2025, 12:00:12 PM
class Solution {
    public long mostPoints(int[][] q) {
        long dp[]=new long [q.length];
        Arrays.fill(dp,-1);
        return gen(q,dp,0);
        
    }
    public static long gen(int [][]q,long []dp,int i){
        if(i>=q.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        long l=q[i][0]+gen(q,dp,i+q[i][1]+1);
        long r=gen(q,dp,i+1);
        dp[i]=Math.max(l,r);
        return dp[i];
    }
}