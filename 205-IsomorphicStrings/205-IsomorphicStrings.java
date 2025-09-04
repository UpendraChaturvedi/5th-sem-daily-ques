// Last updated: 9/4/2025, 12:06:23 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int mp1[]=new int[256];
        int mp2[]=new int [256];
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(mp1[c1]!=mp2[c2]) return false;
            mp1[c1]=i+1;
            mp2[c2]=i+1;
        }
        return true;
    }
}