// Last updated: 9/4/2025, 12:04:10 PM
class Solution {
    public int minDistance(String word1, String word2) {
        //String s2 = new StringBuilder(s).reverse().toString();
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int [n][m];
        for(int i[]:dp) Arrays.fill(i,-1);
        return (word1.length()-lcs(word1,word2,n-1,m-1,dp)+word2.length()-lcs(word1,word2,n-1,m-1,dp));
        
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