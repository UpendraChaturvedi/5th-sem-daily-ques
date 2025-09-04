// Last updated: 9/4/2025, 12:01:11 PM
class Solution {
    public int maxDepth(String s) {
        int c=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
                res=Math.max(res,c);
            }
            else if(s.charAt(i)==')'){
                c--;
            }
            res=Math.max(res,c);
        }
        return res;
        
        
    }
}