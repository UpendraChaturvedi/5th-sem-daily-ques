// Last updated: 9/4/2025, 12:07:06 PM
class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                a+=c;
            }
        }
        a=a.toLowerCase();
        int l=0;
        int n=a.length()-1;
        int h=n;
        while(l<=h){
            if(a.charAt(l)!=a.charAt(h)){
                return false;
            }
            else{
                l++;
                h--;
            }
        }
        return true;


        
    }
}