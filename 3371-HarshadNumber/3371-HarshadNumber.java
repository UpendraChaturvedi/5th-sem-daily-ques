// Last updated: 9/4/2025, 11:59:03 AM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int t=x;
        int s=0;
        while(t!=0){
            s+=t%10;
            t=t/10;
        }
        if(x%s==0){
            return s;
        }
        return -1;
        
    }
}