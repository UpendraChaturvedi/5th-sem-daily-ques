// Last updated: 9/4/2025, 11:58:54 AM
class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String>a=new ArrayList<>();
        gen(a,n,"",0);
        // ArrayList<String>b=new ArrayList<>();
        // for(String i:a){
        //     if(i.contains("1")){
        //         b.add(i);
        //     }
        // }
        return a;
        
    }
    public static void gen(ArrayList<String>a,int n,String ans,int i){
        if(i==n){
            a.add(ans);
            return ;
        }
        // gen(a,n,ans+'0',i+1);
        gen(a,n,ans+'1',i+1);
        if (ans.isEmpty() || ans.charAt(ans.length() - 1) == '1') {
            gen(a, n, ans + '0', i + 1);
        }
    }
}