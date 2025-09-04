// Last updated: 9/4/2025, 12:03:09 PM
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean []visited=new boolean [n];
        bfs(rooms,0,visited);
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false) return false;
        }
        return true;
    }
    public static void bfs(List<List<Integer>> rooms,int src,boolean []visited){
        Queue<Integer>q=new LinkedList<>();
        visited[src]=true;
        q.offer(src);
        while(!q.isEmpty()){
            int curr=q.poll();
            List<Integer>l=rooms.get(curr);
            for(int i:l){
                if(!visited[i]){
                    q.offer(i);
                    visited[i]=true;
                }
            }
        }
    }
}