// Last updated: 9/4/2025, 12:00:10 PM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
    
        for(String a:words){
            if (a.startsWith(pref)) {
                c++;
            }
        }
        return c;
        
    }
}