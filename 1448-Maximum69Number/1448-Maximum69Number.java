// Last updated: 9/4/2025, 12:01:42 PM
class Solution {
    public int maximum69Number (int num) {
        int c=0;
        String s=num+"";
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='6' && c==0){
                ans.append("9");
                c++;
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return Integer.parseInt(ans.toString());
    }
}