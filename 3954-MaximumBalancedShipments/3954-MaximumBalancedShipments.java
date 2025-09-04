// Last updated: 9/4/2025, 11:58:09 AM
class Solution {
    public int maxBalancedShipments(int[] w) {
        int sp=0;
        int n=w.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(w[i]<mx){
                sp++;
                mx=Integer.MIN_VALUE;
            }
            else{
                mx=Math.max(mx,w[i]);
            }
        }
        return sp;
    }
}