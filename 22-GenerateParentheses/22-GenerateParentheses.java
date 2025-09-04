// Last updated: 9/4/2025, 12:08:36 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>s=new ArrayList<>();
        gen(n,"",s,0,0);
        return s;

        
    }
    public static void gen(int n,String a,List<String>s,int o,int c){
        if(o==n && c==n){
            s.add(a);
        }
        if(o<n){
            gen(n,a+'(',s,o+1,c);
        }
        if(c<o){
            gen(n,a+')',s,o,c+1);
        }
    }
}