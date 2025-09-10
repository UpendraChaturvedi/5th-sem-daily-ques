// Last updated: 9/10/2025, 10:48:04 AM
class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s);
        String s1=sb.reverse().toString();
        int n=s.length();
        int [][]dp=new int [n+1][n+1];
        for(int []p:dp){
            Arrays.fill(p,-1);
        }
        return subseq(dp,s,s1,n-1,n-1);
    }
    public static int subseq(int [][]dp,String s,String s1,int n,int m){
        if(n<0 || m< 0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(s.charAt(n)==s1.charAt(m)){
            return dp[n][m]=subseq(dp,s,s1,n-1,m-1)+1;
        }
        return dp[n][m]=Math.max(subseq(dp,s,s1,n-1,m),subseq(dp,s,s1,n,m-1));
    }
}