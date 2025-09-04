// Last updated: 9/4/2025, 12:08:39 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char t=st.peek();
                if (t=='(' && c==')' || t=='[' && c==']' || t=='{' && c=='}' ){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}