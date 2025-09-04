// Last updated: 9/4/2025, 12:08:52 PM
class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String w=s.substring(i,j+1);
                if(ispal(w)&& w.length() > ans.length()){
                    ans=w;
                }
            }
        }
        return ans;
    }
    public static boolean ispal(String s){
        int l=0;
        int h=s.length()-1;
        while(l<=h){
            if(s.charAt(l)!=s.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}