// Last updated: 10/23/2025, 8:44:32 PM
class Solution {
    public boolean scoreBalance(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            String s1=s.substring(0,i+1);
            String s2=s.substring(i+1);
            if(score(s1)==score(s2)){
                return true;
            }
        }
        return false;
    }
    public static int score(String s){
        int su=0;
        for(char c:s.toCharArray()){
            su+=c-'a'+1;
        }
        return su;
    }
}