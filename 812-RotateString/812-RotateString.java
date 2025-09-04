// Last updated: 9/4/2025, 12:03:15 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String n=s+s;
        if(n.contains(goal)){
            return true;
        }
        return false;
        
    }
}