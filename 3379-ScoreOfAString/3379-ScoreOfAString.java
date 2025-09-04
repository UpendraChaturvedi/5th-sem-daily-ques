// Last updated: 9/4/2025, 11:59:02 AM
class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return sum;
        
    }
}