// Last updated: 12/21/2025, 8:48:17 PM
1class Solution {
2    public String longestNiceSubstring(String s) {
3        int n=s.length();
4        String prev="";
5        for(int i=0;i<n;i++){
6            for(int j=i;j<n;j++){
7                String sn=s.substring(i,j+1);
8                if(isval(sn) && sn.length()>prev.length()){
9                    prev=sn;
10                }
11            }
12        }
13        return prev;
14    }
15    public static boolean isval(String s){
16        for(char ch:s.toCharArray()){
17            if(!s.contains(Character.toString(Character.toLowerCase(ch))) || !s.contains(Character.toString(Character.toUpperCase(ch)))){
18                return false;
19            }
20        }
21        return true;
22    }
23}