// Last updated: 9/4/2025, 12:02:43 PM
class Solution {
    public int fib(int n) {
        int s=0;
        int n1=0;
        int n2=1;
        int n3;
        // if(n==0){
        //     return n;
        // }
        // if(n==1){
        //     return n;
        // }
        
        for(int i=0;i<=n-1;i++){
            
            n1=n2;
            n2=s;
            s=n1+n2;
        }
        return s;
        
    }
}