// Last updated: 9/4/2025, 11:58:53 AM
class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt((i+k)%n));
        }
        return sb.toString();
    }
}