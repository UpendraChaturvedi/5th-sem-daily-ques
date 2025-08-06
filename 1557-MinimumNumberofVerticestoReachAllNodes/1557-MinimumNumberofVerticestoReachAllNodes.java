// Last updated: 8/6/2025, 4:45:08 PM
class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<List<Integer>> adj=new ArrayList<>();
        List<Integer>ans1=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        boolean[] hasIncoming = new boolean[n];
        for(List<Integer>p:edges){
            int n1=p.get(0);
            int n2=p.get(1);
            adj.get(n1).add(n2);
            hasIncoming[n2] = true;
        }
        boolean vis[]=new boolean [n];
        for(int i=0;i<n;i++){
            if(!hasIncoming[i]){
                bfs(adj,vis,i);
                ans1.add(i);
            }
        }
        return ans1;
    }
    public static void bfs(List<List<Integer>> adj,boolean vis[],int i){
        Queue<Integer>q=new LinkedList<>();
        q.offer(i);
        vis[i]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            List<Integer>l1=adj.get(curr);
            for(int j:l1){
                if(!vis[j]){
                    q.offer(j);
                    vis[j]=true;
                }
            }
        }
    }
}