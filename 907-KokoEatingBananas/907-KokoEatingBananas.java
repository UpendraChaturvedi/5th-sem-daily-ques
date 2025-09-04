// Last updated: 9/4/2025, 12:03:02 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int maxSpeed=0;
        for (int pile : piles) {
            maxSpeed = Math.max(maxSpeed, pile);
        }
        int r=maxSpeed;
        while(l<=r){
            int m=l+(r-l)/2;
            if(maxtime(piles,m)<=h){
                r=m-1;
            }
            else{
                l=m+1;
            }
            
        }
        return l;
    }
    public static int maxtime(int piles[],int m){
        int totalhours=0;
        for (int pile : piles) {
            totalhours += Math.ceil((double) pile / m); // Use floating-point division
        }
        return totalhours;
    }

    
        
    
}