// Last updated: 9/4/2025, 12:03:24 PM
class Solution {
    public int numJewelsInStones(String j, String stones) {
        int c=0;
        
        for(int i=0;i<stones.length();i++){
            if(j.contains(""+(stones.charAt(i)))){
                c++;
            }
        }
        return c;
        
    }
}