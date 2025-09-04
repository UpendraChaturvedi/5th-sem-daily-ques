// Last updated: 9/4/2025, 12:00:25 PM
class Solution {
    public boolean validPath(int n, int[][] edg, int src, int dest) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0; i<n;i++) {
            adj.add(new ArrayList<>());
        }
        for(int []e:edg){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean vis[]=new boolean[n];
        return dfs(adj,src,dest,vis);
    }
    public static boolean dfs(List<List<Integer>> adj,int src,int dest,boolean vis[]){
        if(src==dest) return true;
        vis[src]=true;
        for(int neighbour:adj.get(src)){
            if(vis[neighbour]!=true){
                if(dfs(adj,neighbour,dest,vis)) return true;
            }
        }
        return false;
    }
}