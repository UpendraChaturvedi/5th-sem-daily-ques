// Last updated: 9/4/2025, 12:05:27 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        long l=1;
        long h=num;
        while(l<=h){
            long m=l+(h-l)/2;
            long sq=m*m;
            if(sq==num){
                return true;
            }
            else if(sq<num){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return false;
        
    }
}