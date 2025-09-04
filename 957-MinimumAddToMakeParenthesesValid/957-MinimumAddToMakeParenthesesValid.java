// Last updated: 9/4/2025, 12:02:52 PM
class Solution {
    public int minAddToMakeValid(String s) {
        int bal=0;
        int ins=0;
        for(char c:s.toCharArray()){
            if(c=='('){
              bal++;
            }
            else{
                if(bal>0){
                    bal--;
                }
                else{
                    ins++;
                }
            }
        }
        return bal+ins;
    }
}