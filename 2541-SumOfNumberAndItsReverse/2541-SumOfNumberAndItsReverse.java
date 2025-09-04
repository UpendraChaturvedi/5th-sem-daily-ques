// Last updated: 9/4/2025, 11:59:42 AM
class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
            if(i+rev(i)==num) return true;
        }
        return false;
    }
    public static int rev(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev;
    }
}