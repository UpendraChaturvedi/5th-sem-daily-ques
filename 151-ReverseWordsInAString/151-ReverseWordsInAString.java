// Last updated: 9/4/2025, 12:06:48 PM
class Solution {
    public String reverseWords(String s) {
        String []s1=s.trim().split("\\s+");;
        String ans="";
        for(int i=s1.length-1;i>=0;i--){
            ans+=(s1[i])+" ";
        }
        return ans.trim();
    }
}