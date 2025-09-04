// Last updated: 9/4/2025, 11:58:13 AM
class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>=97 &&ch<123) {
                sb.append(ch);
            }
            else if(sb.length()>0 && ch=='*'){
                sb.deleteCharAt(sb.length()-1);
            }
            else if(ch=='#'){
                sb.append(sb);
            }
            else if(ch=='%'){
                sb.reverse();
            }
        }
        return sb.toString();
    }
}