// Last updated: 9/4/2025, 12:00:50 PM
class Solution {
    public int findCenter(int[][] e) {
        int n=e.length;
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<e.length;i++){
            int v1=e[i][0];
            int v2=e[i][1];
            h.put(v1,h.getOrDefault(v1,0)+1);
            h.put(v2,h.getOrDefault(v2,0)+1);
            if(h.get(v1)==n){
                return v1;
            }
            if(h.get(v2)==n){
                return v2;
            }
        }
        return -1;
        
    }
}