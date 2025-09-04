// Last updated: 9/4/2025, 12:03:30 PM
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            int n=Integer.bitCount(i);
            if(isprime(n)){
                c++;
            }
        }
        return c;
        
    }
    public static boolean isprime(int n){
        if (n < 2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}