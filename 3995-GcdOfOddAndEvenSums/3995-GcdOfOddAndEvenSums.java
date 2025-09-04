// Last updated: 9/4/2025, 11:58:02 AM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int co=n*n;
        int ce=n*(n+1);
        return gcd(co,ce);
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}