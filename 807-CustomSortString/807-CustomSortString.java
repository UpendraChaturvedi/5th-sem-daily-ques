// Last updated: 9/4/2025, 12:03:16 PM
class Solution {
    public String customSortString(String order, String s) {
        ArrayList<Character>l=new ArrayList<>();
        for(char c:s.toCharArray()){
            l.add(c);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<order.length();i++){
            char ch=order.charAt(i);
            while(l.contains(ch)){
                sb.append(ch);
                l.remove((Character)ch);
            }
        }
        for(char ch:l){
            
                sb.append(ch);
            
        }
        return sb.toString();
    }
}