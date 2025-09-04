// Last updated: 9/4/2025, 12:04:17 PM
class Solution {
    public String reverseWords(String s) {
        String []c=s.split(" ");
        String ans="";
        for(String i:c){
            StringBuilder n=new StringBuilder(i);
            ans+=n.reverse().toString()+" ";
        }
        return ans.trim();
        
    }
}