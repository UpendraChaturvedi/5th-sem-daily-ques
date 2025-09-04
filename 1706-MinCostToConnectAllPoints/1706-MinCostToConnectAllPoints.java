// Last updated: 9/4/2025, 12:01:14 PM
class Solution {
    class Pair implements Comparable<Pair>{
        int node;
        int parent;
        int dist;
        Pair(int node,int parent,int dist){
            this.node=node;
            this.parent=parent;
            this.dist=dist;
        }
        public int compareTo(Pair o){
            return this.dist-o.dist;
        }
    }
    
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        int s=0;
        int n=points.length;
        boolean vis[]=new boolean [points.length];
        pq.add(new Pair(0, -1, 0));
        while(pq.size()>0){
            Pair p=pq.poll();
            int ele=p.node;
            int par=p.parent;
            int dist=p.dist;
            if(vis[ele]) continue;
            s+=dist;
            vis[ele]=true;
            for(int i=0;i<n;i++){
                if(!vis[i]){
                    int x1=points[ele][0];
                int y1=points[ele][1];
                int x2=points[i][0];
                int y2=points[i][1];
                int newdist=Math.abs(x1-x2)+Math.abs(y1-y2);
                pq.add(new Pair(i,ele,newdist));
                }
            }

        }
        return s;
    }
}