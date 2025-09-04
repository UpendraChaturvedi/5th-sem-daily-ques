// Last updated: 9/4/2025, 12:01:06 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(String i:word1){
            sb1.append(i);
        }
        for(String i:word2){
            sb2.append(i);
        }
        return sb1.toString().equals(sb2.toString());
        
    }
}