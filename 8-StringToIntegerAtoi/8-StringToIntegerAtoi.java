// Last updated: 9/4/2025, 12:08:50 PM
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int i=0;
        int sign=1;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            sign=(s.charAt(i)=='-'?-1:1);
            i++;
        }
        int n=s.length();
        long num=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            num=num*10+(s.charAt(i)-'0');
            if(sign==1 && num>Integer.MAX_VALUE)return Integer.MAX_VALUE;
            if( sign==-1 && -num<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(sign*num);
    }
}