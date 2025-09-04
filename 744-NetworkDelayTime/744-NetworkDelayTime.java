// Last updated: 9/4/2025, 12:03:32 PM
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int dist[]=new int [n+1];
        
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<times.length;j++){
                int u=times[j][0];
                int v=times[j][1];
                int t=times[j][2];
                if(dist[u]!=Integer.MAX_VALUE && dist[u]+t<dist[v]){
                    dist[v]=dist[u]+t;
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1; 
            ans = Math.max(ans, dist[i]);
        }

        return ans;

    }
}