// Last updated: 9/4/2025, 12:07:53 PM
class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder ans=new StringBuilder();
        int i=s1.length()-1;
        int j=s2.length()-1;
        int c=0;
        while(i>=0 || j>=0 ||c==1){
            // if(s.charAt(i)==1 || s.charAt(j)==1 || c=1){
                int b1=i>=0?s1.charAt(i--)-'0':0;
                int b2=j>=0?s2.charAt(j--)-'0':0;
                int sum=b1+b2+c;
                ans.append(sum%2);
                c=sum/2;
            
        }
        return ans.reverse().toString();
        
    }
}