// Last updated: 9/4/2025, 12:02:10 PM
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        TreeMap<Integer,Integer>h=new TreeMap<>();
        for(int []p:trips){
            int num=p[0];
            int fr=p[1];
            int to=p[2];
            h.put(fr,h.getOrDefault(fr,0)+num);
            h.put(to,h.getOrDefault(to,0)-num);
        }
        int tot=0;
        for(int i:h.keySet()){
            int v=h.get(i);
            tot+=v;
            if(tot>capacity) return false;
        }
        return true;
    }
}