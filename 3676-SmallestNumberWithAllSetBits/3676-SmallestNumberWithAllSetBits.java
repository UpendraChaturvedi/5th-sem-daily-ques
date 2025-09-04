// Last updated: 9/4/2025, 11:58:41 AM
class Solution {
    public int smallestNumber(int n) {
        int c=0;
        while(n!=0){
            n/=2;
            c++;
        }
        return ((int)Math.pow(2,c))-1;
        
    }
}