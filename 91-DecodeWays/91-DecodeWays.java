// Last updated: 9/4/2025, 12:07:33 PM
class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return gen(s,dp,0);
    }
    public static int gen(String s,int dp[],int i){
        if(i==s.length()) return 1;
        int n=s.length();
        int ways=0;
        if(s.charAt(i)=='0') return 0;
        if (dp[i] != -1) return dp[i];
        ways+=gen(s, dp, i + 1);
        if(i+1<n){
            int num=Integer.parseInt(s.substring(i,i+2));
            if(num>=10 && num<=26){
                ways+=gen(s,dp,i+2);
            }
        }
        dp[i] = ways;
        return ways;
    }
}