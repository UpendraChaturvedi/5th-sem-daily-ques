// Last updated: 9/4/2025, 11:38:00 AM
class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount + 1][coins.length];
        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                dp[i][j] = -1;  
            }
        }
        return coinchan(coins, amount, 0, dp);
    }
    public static int coinchan(int []coin,int amount,int i,int dp[][]){
        if(amount==0){
            return 1;
        }
        if(i==coin.length){
            return 0;
        }
        if(dp[amount][i]!=-1){
            return dp[amount][i];
        }
        int inc=0;
        int exc=0;
        if(amount>=coin[i]){
            inc=coinchan(coin,amount-coin[i],i,dp);
        }
        exc=coinchan(coin,amount,i+1,dp);
        return dp[amount][i]=inc+exc;
    }
}