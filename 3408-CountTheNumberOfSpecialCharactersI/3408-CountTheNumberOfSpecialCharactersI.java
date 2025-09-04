// Last updated: 9/4/2025, 11:59:01 AM
class Solution {
    public int numberOfSpecialChars(String s) {
        HashSet<Character>l=new HashSet<>();
        HashSet<Character>h=new HashSet<>();
        for(char c:s.toCharArray()){
            if (Character.isLowerCase(c)) {
                l.add(c);
            }
            else{
                h.add(c);
            }
        }
        int co=0;
        for (char c : l) {
            if (h.contains(Character.toUpperCase(c))) {
                co++;
            }
        }
        return co;

        
    }
}