// Last updated: 9/4/2025, 12:00:43 PM
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, ""); 
        }
        return s;
        
    }
}