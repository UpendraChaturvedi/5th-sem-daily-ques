// Last updated: 9/4/2025, 12:00:04 PM
class Solution {
    public String largestGoodInteger(String num) {
        String ans="";
        int n=num.length();
        int max=-1;
        for(int i=0;i<=n-3;i++){
            HashSet<Character>h=new HashSet<>();
            for(int j=i;j<i+3;j++){
                h.add(num.charAt(j));
            }
            if(h.size()==1){
                String s=num.substring(i,i+3);
                int n1=Integer.parseInt(s);
                if(n1>max){
                    max=n1;
                    ans=s;
                }
            }
        }
        return ans;

    }
}