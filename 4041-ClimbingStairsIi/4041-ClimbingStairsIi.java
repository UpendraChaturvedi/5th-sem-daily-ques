// Last updated: 10/23/2025, 8:44:40 PM
class Solution {
    public int climbStairs(int n, int[] costs) {
        int an[]=costs;
        int dp[]=new int [n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<n;i++){
            if(dp[i]==Integer.MAX_VALUE)continue;
            for(int jp=1;jp<=3;jp++){
                int j=i+jp;
                if(j<=n){
                    int z=an[j-1];
                    dp[j]=Math.min(dp[j],dp[i]+z+jp*jp);
                }
                
            }
        }
        return dp[n];
    }
}