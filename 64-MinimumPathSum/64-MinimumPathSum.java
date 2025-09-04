// Last updated: 9/4/2025, 12:07:55 PM
class Solution {
    public int minPathSum(int[][] g) {
        int[][] dp=new int[g.length][g[0].length];
        for(int i=0;i<g.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return sum(g, 0, 0, g.length - 1, g[0].length - 1,dp);
    }

    public static int sum(int[][] g, int s, int c, int er, int ec,int [][]dp) {
        if (s > er || c > ec) {
            return Integer.MAX_VALUE;
        }
        if(dp[s][c]!=-1){
            return dp[s][c];
        }
        if (s == er && c == ec) {
            return g[s][c];
        }
        int down = sum(g, s + 1, c, er, ec,dp);
        int right = sum(g, s, c + 1, er, ec,dp);
        return dp[s][c]=g[s][c] + Math.min(down, right);
        
    }
}