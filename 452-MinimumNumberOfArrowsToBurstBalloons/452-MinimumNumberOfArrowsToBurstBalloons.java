// Last updated: 9/4/2025, 12:04:52 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int lastpos=points[0][1];
        int arrow=1;
        int n=points.length;
        for(int i=1;i<n;i++){
            if(lastpos<points[i][0]){
                arrow++;
                lastpos=points[i][1];
                
            }
        }
        return arrow;
    }
}