// Last updated: 9/4/2025, 12:08:45 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder lp=new StringBuilder();
        String fir=strs[0];
        int ind=0;
        for(int i=0;i<fir.length();i++){
            String ch=fir.substring(0,i+1);
            boolean found=true;
            for(String s:strs){
                if(!s.startsWith(ch)){
                    found=false;
                    break;
                }
            }
            if(found==true){
                ind=i+1;
            }
        }
        return fir.substring(0,ind);
        
    }
}