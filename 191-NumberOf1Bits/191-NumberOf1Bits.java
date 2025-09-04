// Last updated: 9/4/2025, 12:06:32 PM
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        // String binary = Integer.toBinaryString(number);
        String a="";
        int r;
        while(n>0){
            r=n%2;
            a+=r;
            n=n/2;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1'){
                c++;
            }
        }
        return c;
        
    }
}