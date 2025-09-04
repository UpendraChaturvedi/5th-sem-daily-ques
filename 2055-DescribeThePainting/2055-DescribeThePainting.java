// Last updated: 9/4/2025, 12:00:37 PM
class Solution {
    public List<List<Long>> splitPainting(int[][] seg) {
        TreeMap<Integer,    Long>h=new TreeMap<>();
        for(int []p:seg){
            int st=p[0];
            int end=p[1];
            int color=p[2];
            h.put(st,h.getOrDefault(st,0L)+color);
            h.put(end,h.getOrDefault(end,0L)-color);
        }
        long currsum=0;
        int prev=-1;
        List<List<Long>> result = new ArrayList<>();
        for(Map.Entry<Integer,Long>e:h.entrySet()){
            int pos = e.getKey();
            long val = e.getValue();
            if(prev!=-1 && currsum!=0){
                result.add(List.of((long) prev, (long) pos, currsum));
            }
            currsum += val;
            prev = pos;
        }
        return result;
    }
}