// Last updated: 9/4/2025, 12:02:23 PM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int n=s.length();
        int op=0;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='('){
                if(op>0)sb.append(ch);
                op++;
            }
            else{
                op--;
                if(op>0) sb.append(ch);
            }
            i++;
        }
        return sb.toString();
    }
}