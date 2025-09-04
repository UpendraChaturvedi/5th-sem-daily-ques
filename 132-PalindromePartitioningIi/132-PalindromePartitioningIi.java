// Last updated: 9/4/2025, 12:07:01 PM
class Solution {
    public int minCut(String s) {
        int dp[][]=new int[2001][2001];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        return solve(s,0,s.length()-1,dp);
    }
    static int solve(String s,int i,int j,int dp[][]){
        int min=Integer.MAX_VALUE;
        if(i>=j){
            return 0;
        }
        if(palindrome(s,i,j)){
            dp[i][j]=0;
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        for(int k=i;k<=j-1;k++){
            if(palindrome(s,i,k)){
                int temp=1+solve(s,k+1,j,dp);
                min=Math.min(min,temp);
            }
        }
        dp[i][j]=min;
        return min;
    }
    static boolean palindrome(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}