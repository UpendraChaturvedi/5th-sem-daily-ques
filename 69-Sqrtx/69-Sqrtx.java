// Last updated: 9/4/2025, 12:07:52 PM
class Solution {
    public int mySqrt(int x) {
        int l=1;
        int h=x;
        while(l<=h){
            int m=l+(h-l)/2;
            long msq = (long) m * m;
            if(msq==x){
                return m;
            }
            if(msq>x){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return h;
        
    }
}