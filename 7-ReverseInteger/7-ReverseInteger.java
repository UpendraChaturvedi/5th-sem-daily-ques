// Last updated: 9/4/2025, 12:08:51 PM
class Solution {
    public int reverse(int x) {
        long r=0;
        while(x!=0){
            r=r*10+x%10;
            x=x/10;
        }
        if(x<0){
            return (int)(-1*r);
        }
        if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE){
            return 0;
        }
        return (int)r;
        
    }
}