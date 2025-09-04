// Last updated: 9/4/2025, 12:03:56 PM
class Solution {
    public int countSubstrings(String s) {
        int c=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String a=s.substring(i,j+1);
                if(ispal(a)){
                    c++;
                }
            }
        }
        return c;
        
    }
    public static boolean ispal(String a){
        int st=0;
        int ei=a.length()-1;
        while(st<ei){
            if(a.charAt(st)!=a.charAt(ei)){
                return false;
            }
            st++;
            ei--;
        }
        return true;
    }
}