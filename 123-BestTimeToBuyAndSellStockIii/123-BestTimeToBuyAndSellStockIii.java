// Last updated: 9/4/2025, 12:07:07 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        Integer[][][] dp = new Integer[n][2][3];
        return maxpr(prices,0,1,2,dp);
    }
    public static int maxpr(int []prices,int i,int comp,int k,Integer [][][]dp){
        if(i==prices.length || k==0){
            return 0;
        }
        if(dp[i][comp][k]!=null){
            return dp[i][comp][k];
        }
        if(comp==1){
            int buy=-prices[i]+maxpr(prices,i+1,0,k,dp);
            int skip=maxpr(prices,i+1,1,k,dp);
            dp[i][comp][k]=Math.max(buy,skip);
        }
        else{
            int sell=prices[i]+maxpr(prices,i+1,1,k-1,dp);
            int skip=maxpr(prices,i+1,0,k,dp);
            dp[i][comp][k]=Math.max(sell,skip);
        }
        return dp[i][comp][k];
    }
}