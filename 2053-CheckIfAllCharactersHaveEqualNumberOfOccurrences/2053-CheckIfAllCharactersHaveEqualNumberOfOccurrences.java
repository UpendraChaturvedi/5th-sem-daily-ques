// Last updated: 9/4/2025, 12:00:38 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>h=new HashMap<>();
        for(char c:s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        int prev=-1;
        for(int i:h.values()){
            if(prev==-1) prev=i;
            else if(prev!=i) return false;
        }
        return true;
    }
}