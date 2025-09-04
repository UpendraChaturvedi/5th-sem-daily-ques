// Last updated: 9/4/2025, 12:02:57 PM
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pat) {
        ArrayList<String>l=new ArrayList<>();
        for(String s:words){
            int mp1[]=new int [256];
            int mp2[]=new int [256];
            if(s.length()!=pat.length()) break;
            boolean istrue=true;
            for(int i=0;i<s.length();i++){
                if(mp1[s.charAt(i)]!=mp2[pat.charAt(i)]){
                    istrue=false;
                    break;
                }
                else{
                    mp1[s.charAt(i)]=i+1;
                    mp2[pat.charAt(i)]=i+1;
                }
            }
            if(istrue){
                l.add(s);
            }
        }
        return l;
    }
}