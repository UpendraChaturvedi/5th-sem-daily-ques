// Last updated: 11/16/2025, 7:20:53 AM
class Solution {
    public int numSub(String s) {
        long res=0;
        long mod = 1_000_000_007;
        long c=0;
        for(char i:s.toCharArray()){
            if(i=='1'){
                c++;
                res+=c;
                res%=mod;
            }
            else{
                c=0;
            }
        }
        return (int)res;
    }
}