// Last updated: 9/4/2025, 12:03:44 PM
class Solution {
    int parent[];
    int size[];
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        parent=new int [n+1];
        size=new int [n+1];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
        
        for(int p[]:edges){
            int a=find(p[0]);
            int b=find(p[1]);
            if(a==b){
                return new int []{p[0],p[1]}; 
            }
            else{
                union(a,b);
            }
        }
        return new int []{};
    }
    public int find(int u){
        if(parent[u]!=u){
            parent [u]=find(parent[u]);
        }
        return parent[u];
    }
    public void union(int a,int b){
        if(size[a]<size[b]){
            parent[a]=b;
            size[b]+=size[a];
        }
        else{
            parent[b]=a;
            size[a]+=size[b];
        }
    }
}