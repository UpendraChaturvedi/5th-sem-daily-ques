// Last updated: 9/4/2025, 12:02:13 PM
class Solution {
    public int largestValsFromLabels(int[] v, int[] l, int num, int u) {
        int n = v.length;
        int [][]items=new int [n][2];
        for(int i=0;i<n;i++){
            items[i][0]=v[i];
            items[i][1]=l[i];
        }
        int s=0;
        Arrays.sort(items,(a,b)->b[0]-a[0]);
        int took=0;
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<n && took<num;i++){
            int val=items[i][0];
            int lab=items[i][1];
            int used=h.getOrDefault(lab, 0);
             if (used<u) {
                s+=val;
                took++;
                h.put(lab, used+1);
            }
        }
        return s;
    }
}