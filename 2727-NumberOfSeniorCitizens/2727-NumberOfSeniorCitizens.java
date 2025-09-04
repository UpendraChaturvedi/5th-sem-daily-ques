// Last updated: 9/4/2025, 11:59:29 AM
class Solution {
    public int countSeniors(String[] details) {
        int s=0;
        for(String ch:details){
            char t=ch.charAt(11);
            char o=ch.charAt(12);
            if(t>'6' ||(t=='6'&& o>'0')){
                s++;
            }
        }
        return s;
        
    }
}