// Last updated: 9/4/2025, 12:01:37 PM
class Solution {
    public int countNegatives(int[][] g) {
        int c=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]<0) c++;
            }
        }
        return c;
    }
}