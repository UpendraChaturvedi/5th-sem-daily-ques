// Last updated: 9/4/2025, 12:05:57 PM
class Solution {
    public boolean isUgly(int n) {
        if(n<1){
            return false;
        }
        while(n>1){
            if(n%2==0){
                n/=2;
            }
            else if(n%3==0){
                n/=3;
            }
            else if(n%5==0){
                n/=5;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}