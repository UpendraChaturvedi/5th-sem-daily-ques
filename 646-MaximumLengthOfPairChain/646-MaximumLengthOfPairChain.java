// Last updated: 9/4/2025, 12:03:57 PM
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int last=pairs[0][1];
        int n=pairs.length;
        int c=1;
        for(int i=1;i<n;i++){
            if(pairs[i][0]>last){
                c++;
                last=pairs[i][1];
            }
        }
        return c;
    }
}