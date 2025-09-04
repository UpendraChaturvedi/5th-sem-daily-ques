// Last updated: 9/4/2025, 12:02:21 PM
class Solution {
    public int twoCitySchedCost(int[][] cos) {
        int tot=0;
        int n=cos.length/2;
        Arrays.sort(cos,(a,b)->((a[1]-a[0])-(b[1]-b[0])));
        for(int i=0;i<n;i++){
            tot+=cos[i][1];
        }
        for(int i=n;i<2*n;i++){
            tot+=cos[i][0];
        }
        return tot;
        
    }
}