// Last updated: 9/4/2025, 12:00:59 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int pre[]=new int [n+1];
        int max=0;
        pre[0]=0;
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+gain[i];
            max=Math.max(pre[i+1],max);
        }
        return max;
    }
}