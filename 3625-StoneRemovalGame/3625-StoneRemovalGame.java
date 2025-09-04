// Last updated: 9/4/2025, 11:58:44 AM
class Solution {
    public boolean canAliceWin(int n) {
        int a=0;
        int i=10;
        while(n>=i){
            if(a==0 && n>=i){
                a=1;
                n=n-i;
                i--;
            }
            if(a==1 && n>=i){
                a=0;
                n=n-i;
                i--;
            }
        }
        return a==1;
        
    }
}