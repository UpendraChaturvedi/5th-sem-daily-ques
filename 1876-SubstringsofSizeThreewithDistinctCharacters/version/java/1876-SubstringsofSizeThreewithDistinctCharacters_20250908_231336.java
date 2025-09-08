// Last updated: 9/8/2025, 11:13:36 PM
class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<=s.length()-3;i++){
            HashSet<Character>h=new HashSet<>();
            for(int j=i;j<i+3;j++){
                h.add(s.charAt(j));
            }
            if(h.size()==3){
                c++;
            }
        }
        return c;

    }
}