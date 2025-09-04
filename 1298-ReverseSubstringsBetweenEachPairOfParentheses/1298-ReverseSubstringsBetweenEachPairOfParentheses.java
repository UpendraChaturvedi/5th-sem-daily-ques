// Last updated: 9/4/2025, 12:01:59 PM
class Solution {
    public String reverseParentheses(String s) {
        Stack<Character>st =new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==')'){
                StringBuilder temp=new StringBuilder();
                while (!st.isEmpty() && st.peek() != '(') {
                    temp.append(st.pop());
                }
                st.pop();
                for(char c:temp.toString().toCharArray()){
                    st.push(c);
                }
            }
            else{
                st.push(ch);
            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}