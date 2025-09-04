// Last updated: 9/4/2025, 12:04:31 PM
class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int n=s.length();
        int dp[][]=new int [n][n];
        for(int i[]:dp) Arrays.fill(i,-1);
        return lcs(s,s2,n-1,n-1,dp);
        
    }
    public static int lcs(String s1,String s2,int i,int j,int [][]dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+lcs(s1,s2,i-1,j-1,dp);
        }
        else return dp[i][j]=Math.max(lcs(s1,s2,i-1,j,dp),lcs(s1,s2,i,j-1,dp));
    }
    
}