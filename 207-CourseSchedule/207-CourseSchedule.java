// Last updated: 9/4/2025, 12:06:21 PM
class Solution {
    public boolean canFinish(int nc, int[][] pre) {
        List<List<Integer>>l=new ArrayList<>();
        for(int i=0;i<nc;i++) l.add(new ArrayList<>());
        int indeg[]=new int [nc];
        for(int []p:pre){
            int preq=p[1];
            int co=p[0];
            l.get(preq).add(co);
            indeg[co]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<nc;i++){
            if(indeg[i]==0) q.offer(i);
        }
        int c=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            c++;
            for(int neighbour:l.get(curr)){
                if(--indeg[neighbour]==0) q.offer(neighbour);
            }
        }
        return c==nc;
        
    }
}