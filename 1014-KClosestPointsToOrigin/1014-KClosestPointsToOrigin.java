// Last updated: 9/4/2025, 12:02:41 PM
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(a[2], b[2]));
        for(int p[]:points){
            int dis=p[0]*p[0]+p[1]*p[1];
            pq.add(new int[]{p[0],p[1],dis});
        }
        int res[][]=new int [k][2];
        for(int i=0;i<k &&!pq.isEmpty();i++){
            int point[]=pq.poll();
            res[i][0]=point[0];
            res[i][1]=point[1];
        
        }
        return res;
    }
}