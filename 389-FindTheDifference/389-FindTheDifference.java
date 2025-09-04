// Last updated: 9/4/2025, 12:05:17 PM
class Solution {
    public char findTheDifference(String s, String t) {
        
        int to=0;
        for(char c:t.toCharArray()){
            to+=c;
        }
        for(char c:s.toCharArray()){
            to-=c;
        }
        return (char)to;
        
        
    }
}