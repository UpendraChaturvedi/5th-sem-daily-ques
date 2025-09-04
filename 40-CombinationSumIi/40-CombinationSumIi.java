// Last updated: 9/4/2025, 12:08:19 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candi, int tar) {
        Arrays.sort(candi);
        HashSet<List<Integer>>h=new HashSet<>();
        backtrack(candi,tar,h,new ArrayList<>(),0,0);
        List<List<Integer>>ans =new ArrayList<>(h);
        return ans;
    }
    public static void backtrack(int[] candi,int tar,HashSet<List<Integer>>h,List<Integer>l,int s,int st){
        if(s==tar){
            h.add(new ArrayList<>(l));
            return ;
        }
        for(int i=st;i<candi.length;i++){
            if (i > st && candi[i] == candi[i - 1]) continue;
            if(s+candi[i]<=tar){
                l.add(candi[i]);
                backtrack(candi,tar,h,l,s+candi[i],i+1);
               l.remove(l.size()-1);
            }
            
        }
    }
}