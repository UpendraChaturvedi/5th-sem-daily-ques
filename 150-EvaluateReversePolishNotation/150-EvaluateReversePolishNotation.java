// Last updated: 9/4/2025, 12:06:49 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String i:tokens){
            if (i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")) {
                int v1=st.pop();
                int v2=st.pop();
                if(i.equals("+")) st.push(v1+v2);
                if(i.equals("-")) st.push(v2-v1);
                if(i.equals("*")) st.push(v1*v2);
                if(i.equals("/")) st.push(v2/v1);
                
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        return st.peek();
        
    }
}