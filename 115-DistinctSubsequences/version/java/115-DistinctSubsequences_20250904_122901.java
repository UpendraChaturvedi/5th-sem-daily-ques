// Last updated: 9/4/2025, 12:29:01 PM
class Solution {
    public int numDistinct(String s, String t) {
        int dp[][]=new int [s.length()+1][t.length()+1];
        for(int p[]:dp){
            Arrays.fill(p,-1);
        }
        return coinchan(s,t,0,0,dp);
    }
    public static int coinchan(String s,String t,int i,int j,int dp[][]){
        if (j == t.length()) {
            return 1;
        }
        if (i == s.length()) {
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int inc=0;
        int exc=0;
        if(s.charAt(i)==t.charAt(j)){
            inc=coinchan(s,t,i+1,j+1,dp);
        }
        exc=coinchan(s,t,i+1,j,dp);
        return dp[i][j]=inc+exc;
    }
}