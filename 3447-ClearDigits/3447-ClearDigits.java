// Last updated: 9/4/2025, 11:58:56 AM
class Solution {
    public String clearDigits(String sb) {
        StringBuilder s=new StringBuilder(sb);
        int n=s.length();
        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
            
                for(int j=i;j>=0;j--){
                    if(Character.isLetter(s.charAt(j))){
                        s.deleteCharAt(j);
                        s.deleteCharAt(i - 1);
                        n -= 2; 
                        i -= 2; 
                        break;
                    }
                }
            }
        }
        return s.toString();
        
    }
}