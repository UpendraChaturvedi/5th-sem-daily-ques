// Last updated: 9/4/2025, 12:00:42 PM
class Solution {
    public String largestOddNumber(String s) {
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if((s.charAt(i)-'0')%2!=0){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}