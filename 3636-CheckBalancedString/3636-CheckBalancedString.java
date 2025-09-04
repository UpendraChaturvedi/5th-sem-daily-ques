// Last updated: 9/4/2025, 11:58:43 AM
class Solution {
    public boolean isBalanced(String num) {
    int so=0;
    int se=0;
        for(int i=0;i<num.length();i++){
            int digit = Character.getNumericValue(num.charAt(i));
            if(i%2==0){
                se+=digit;
            }
            else{
                so+=digit;
            }
        }
        return so==se;
        
    }
}