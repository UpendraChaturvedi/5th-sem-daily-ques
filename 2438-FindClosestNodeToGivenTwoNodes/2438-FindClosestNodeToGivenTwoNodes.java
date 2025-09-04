// Last updated: 9/4/2025, 11:59:54 AM
class Solution {
    public int closestMeetingNode(int[] edg, int node1, int node2) {
        int n=edg.length;
        int dist1 []=new int [edg.length];
        int dist2 []=new int [edg.length];
        for(int i=0;i<n;i++){
            dist1[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++){
            dist2[i]=Integer.MAX_VALUE;
        }
        
        
        bfs(edg,node1,dist1);
        bfs(edg,node2,dist2);
        int minDist = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (dist1[i] != Integer.MAX_VALUE && dist2[i] != Integer.MAX_VALUE) {
                int maxDist = Math.max(dist1[i], dist2[i]);
                if (maxDist < minDist) {
                    minDist = maxDist;
                    ans = i;
                }
            }
        }

        return ans;

    }
    public static void bfs(int []edg,int n1,int []dist1){
        int n=edg.length;
        Queue<Integer>q=new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.offer(n1);
        visited[n1]=true;
        dist1[n1]=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            int neigh=edg[curr];
                if(neigh!=-1 &&!visited[neigh]){
                    dist1[neigh]=dist1[curr]+1;
                    visited[neigh]=true;
                    q.offer(neigh);
                }
            
        }
    }

}