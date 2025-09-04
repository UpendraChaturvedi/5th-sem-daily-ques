// Last updated: 9/4/2025, 12:05:42 PM
class Solution {
    public int bulbSwitch(int n) {
        // boolean arr[]=new boolean [n];
        // int c=0;
        // for(int i=1;i<=n;i++){
        //     if(i==1) arr[i]=true;
        //     if(i==2) if(i%2==0) arr[i]=true;
        //     if(i==n) arr[i]=true;
        //     else{
        //         arr[i]=!(arr[i]);
        //     }
        // }
        // for(boolean i:arr) {
        //     if(i==false) c++;
        // }
        // return c;
        return (int) Math.sqrt(n);
    }
}