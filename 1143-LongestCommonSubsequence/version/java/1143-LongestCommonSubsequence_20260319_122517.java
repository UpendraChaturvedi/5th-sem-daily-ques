// Last updated: 3/19/2026, 12:25:17 PM
1class Solution {
2    public int longestCommonSubsequence(String t1, String t2) {
3        int n=t1.length();
4        int m=t2.length();
5        
6        int dp[][]=new int [n+1][m+1];
7        for(int p[]:dp){
8            Arrays.fill(p,-1);
9        }
10        return longe(t1,t2,n-1,m-1,dp);
11    }
12    public static int longe(String s1,String s2,int n,int m,int dp[][]){
13        if(n<0 || m<0){
14            return 0;
15        }
16        if(dp[n][m]!=-1){
17            return dp[n][m];
18        }
19        if(s1.charAt(n)==s2.charAt(m)){
20            return dp[n][m]=1+longe(s1,s2,n-1,m-1,dp);
21        }
22        return dp[n][m]= Math.max(longe(s1,s2,n-1,m,dp),longe(s1,s2,n,m-1,dp));
23    }
24}