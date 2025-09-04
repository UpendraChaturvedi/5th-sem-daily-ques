// Last updated: 9/4/2025, 12:06:18 PM
class Solution {
    public int[] findOrder(int nc, int[][] pre) {
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        int indeg[]=new int [nc];
        for(int i=0;i<nc;i++){
            l.add(new ArrayList<>());
        }
        for(int []p:pre){
            int c=p[0];
            int preq=p[1];
            l.get(preq).add(c);
            indeg[c]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<nc;i++){
            if(indeg[i]==0)q.add(i);
        }
        while(!q.isEmpty()){
            int curr=q.poll();
            ans.add(curr);
            for(int neighbour:l.get(curr)){
                if(--indeg[neighbour]==0){
                    q.add(neighbour);
                }
            }
        }
        int arr[]=new int [nc];
        if(ans.size()!=nc)return new int [0];
        for(int i=0;i<nc;i++){
            arr[i]=ans.get(i);
        }  
        return arr;   
    }
}