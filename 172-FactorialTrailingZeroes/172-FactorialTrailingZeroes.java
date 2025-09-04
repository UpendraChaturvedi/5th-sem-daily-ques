// Last updated: 9/4/2025, 12:06:38 PM
class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        while(n>0){
            n/=5;
            c+=n;
            
        }
        return c;
        
    }
}