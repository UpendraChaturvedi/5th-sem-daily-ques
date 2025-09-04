// Last updated: 9/4/2025, 11:58:20 AM
class Solution {
    public String resultingString(String s) {
        StringBuilder st=new StringBuilder();
        for(char c:s.toCharArray()){
            int len=st.length();
            if (len > 0 && cons(st.charAt(len - 1), c)) {
                st.deleteCharAt(len - 1);
            }
            else{
                st.append(c);
            }
        }
        return st.toString();
    }
    public static boolean cons(char a,char b){
        int dif=Math.abs(a-b);
        return dif==1||dif==25;
    } 
}