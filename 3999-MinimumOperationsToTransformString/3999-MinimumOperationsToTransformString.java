// Last updated: 10/23/2025, 8:44:46 PM
class Solution {
    public int minOperations(String s) {
        int an=0;
        for(char x:s.toCharArray()){
            int i=(26+('a'-x))%26;
            an=Math.max(an,i);
        }
        return an;
    }
}