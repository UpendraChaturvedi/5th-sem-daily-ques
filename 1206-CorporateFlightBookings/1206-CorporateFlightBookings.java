// Last updated: 9/4/2025, 12:02:09 PM
class Solution {
    public int[] corpFlightBookings(int[][] b, int n) {
        int ans[]=new int [n];
        for(int i=0;i<b.length;i++){
            int st=b[i][0];
            int en=b[i][1];
            int se=b[i][2];
            for(int j=st-1;j<en;j++){
                ans[j]+=se;
            }
        }
        return ans;
        
        
    }
}