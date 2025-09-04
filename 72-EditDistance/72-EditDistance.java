// Last updated: 9/4/2025, 12:07:49 PM
class Solution {
    public int minDistance(String word1, String word2) {
        int n=word2.length();
        int m=word1.length();
        int dp[][]=new int [m+1][n+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return ways(word1,word2,dp,m,n);

    }
    public static int ways(String w1,String w2,int [][]dp,int m,int n){
        if(m==0) return n;
        if(n==0) return m;
        if(dp[m][n]!=-1) return dp[m][n];
        if (w1.charAt(m-1) == w2.charAt(n-1)) {
            return dp[m][n]= ways(w1,w2,dp,m-1,n-1); 
        }
        int l1=ways(w1,w2,dp,m,n-1);
        int l2=ways(w1,w2,dp,m-1,n);
        int l3=ways(w1,w2,dp,m-1,n-1);
        return dp[m][n]= Math.min(l1,Math.min(l2,l3))+1;
    }
}