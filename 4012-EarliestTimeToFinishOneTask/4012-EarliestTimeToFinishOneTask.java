// Last updated: 10/23/2025, 8:44:43 PM
class Solution {
    public int earliestTime(int[][] tasks) {
        int s=Integer.MAX_VALUE;
        for(int []p:tasks){
            int n1=p[0];
            int n2=p[1];
            s=Math.min(s,n1+n2);
        }
        return s;
        
    }
}