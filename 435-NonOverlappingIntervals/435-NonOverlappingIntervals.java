// Last updated: 9/4/2025, 12:05:06 PM
class Solution {
    public int eraseOverlapIntervals(int[][] inter) {
        int n=inter.length;
        List<int[]>ans=new ArrayList<>();
        Arrays.sort(inter,(a,b)->Integer.compare(a[0],b[0]));
        for(int p[]:inter){
            if(ans.size()==0 || ans.get(ans.size()-1)[1]<=p[0]){
                ans.add(p);
            }
            else{
                int st=Math.max(ans.get(ans.size()-1)[0],p[0]);
                int end=Math.min(ans.get(ans.size()-1)[1],p[1]);
                int []intervals={st,end};
                ans.set(ans.size()-1,intervals);
            }
        }
        return inter.length-ans.size();
    }
}