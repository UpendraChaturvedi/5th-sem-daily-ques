// Last updated: 9/4/2025, 12:08:02 PM
class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,(a,b)->a[0]-b[0]);
        ArrayList<int []>l=new ArrayList<>();
        for(int []p:inter){
            if(l.size()==0 || l.get(l.size()-1)[1]<p[0]){
                l.add(p);
            }
            else{
                // l.set(l.size()-1,new int []{l.get(l.size()-1,Math.max(l.get(l.size()-1),p[0]))});
                l.get(l.size()-1)[1] = Math.max(l.get(l.size()-1)[1],p[1]);
            }
        }
        return l.toArray(new int[l.size()][]);
        
    }
}