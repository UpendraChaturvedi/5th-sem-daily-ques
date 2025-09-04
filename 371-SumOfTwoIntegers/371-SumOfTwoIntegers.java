// Last updated: 9/4/2025, 12:05:25 PM
class Solution {
    public int getSum(int a, int b) {
        int c=0;
        while(b!=0){
            c=a&b;
            a=a^b;
            b=c<<1;
        }
        return a;
    }
}