// Last updated: 9/8/2025, 10:37:29 PM
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int i=1;
        int j=n-i;
        while(notcon(i) || notcon(j)){
            i++;
            j=n-i;
        }
        return new int []{i,j};
    }
    public static boolean notcon(int n){
        while(n>0){
            if(n%10==0) return true;
            n=n/10;
        }
        return false;
    }
}