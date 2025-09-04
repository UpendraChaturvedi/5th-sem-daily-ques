// Last updated: 9/4/2025, 12:05:32 PM
class Solution {
    public void reverseString(char[] s) {
        int l=0,h=s.length-1;
        while(l<=h){
            char t =s[l];
            s[l]=s[h];
            s[h]= t;
            l++;
            h--;
        }
        
    }
}