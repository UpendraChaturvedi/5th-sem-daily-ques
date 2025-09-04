// Last updated: 9/4/2025, 12:08:01 PM
class Solution {
    public int[][] insert(int[][] inter, int[] newinter) {
        int n = inter.length;
        int[][] inter1=new int [n+1][2];
        for(int i=0;i<n;i++){
            inter1[i][0]=inter[i][0];
            inter1[i][1]=inter[i][1];
        }
        inter1[n][0]=newinter[0];
        inter1[n][1]=newinter[1];
        Arrays.sort(inter1,(a,b)->(a[0]-b[0]));
        ArrayList<int[]>l=new ArrayList<>();
        for(int p[]:inter1){
            int st=p[0];
            int en=p[1];
            if (l.size()==0||l.get(l.size()-1)[1]<st) {
                l.add(p);
            }
            else {
                l.get(l.size()-1)[1] = Math.max(l.get(l.size()-1)[1],en);
            }
        }
        return l.toArray(new int[l.size()][]);
    }
}