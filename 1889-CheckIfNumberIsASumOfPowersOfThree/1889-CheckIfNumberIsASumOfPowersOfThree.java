// Last updated: 9/4/2025, 12:00:54 PM
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n!=0){
            if(n%3==2){
                return false;
            }
            n=n/3;
        }
        return true;
        
    }
}