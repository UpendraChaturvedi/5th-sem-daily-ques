// Last updated: 9/4/2025, 12:01:45 PM
class Solution {
    int parent[];
    int size[];
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n - 1) return -1;
        parent=new int [n];
        size=new int [n];
        int cmp=n;
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
        for(int p[]:connections){
            int a=p[0];
            int b=p[1];
            if(find(a)!=find(b)){
                union(a,b);
                cmp--;
            }
        }
        return cmp-1;

    }
    private void union(int a,int b){
        int pa=find(a);
        int pb=find(b);
        if (pa == pb) return;
        if(size[pa]<size[pb]){
            parent[pa]=pb;
            size[pb]+=size[pa];

        }
        else{
            parent[pb]=pa;
            size[pa]+=size[pb];
        }
    }
    private int find(int u) {
        if (parent[u] != u) {
            parent[u] = find(parent[u]);
        }
        return parent[u];
    }
}