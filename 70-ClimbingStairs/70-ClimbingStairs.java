// Last updated: 9/4/2025, 12:07:50 PM

class Solution {
    public int climbStairs(int n) {
        int dp[]=new int [n+1];
        Arrays.fill(dp,-1);
        return stairs(dp,n);
   
     
        
        
    }
    public int stairs(int []dp,int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=stairs(dp,n - 1) + stairs(dp,n - 2); 
        return dp[n];
    }
}