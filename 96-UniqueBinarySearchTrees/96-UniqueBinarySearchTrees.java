// Last updated: 9/4/2025, 12:07:29 PM
class Solution {
    public int numTrees(int n) {
        int dp[]=new int [n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int l=0;
            int h=i-1;
            while(l<=i-1){
                dp[i]+=dp[l]*dp[h];
                l++;
                h--;
            }
        }
        return dp[n];
    }
}