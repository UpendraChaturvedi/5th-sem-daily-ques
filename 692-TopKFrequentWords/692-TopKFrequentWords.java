// Last updated: 9/4/2025, 12:03:43 PM
class Solution {
    public class Pair implements Comparable<Pair>{
        String s;
        int freq;
        Pair(String s,int freq){
            this.s=s;
            this.freq=freq;
        }
        public int compareTo(Pair p){
            if (this.freq == p.freq) {
                return p.s.compareTo(this.s);
            }
            return this.freq-p.freq;
        }

    }
    public List<String> topKFrequent(String[] w, int k) {
        List<String>l=new ArrayList<>();
        HashMap<String,Integer>h=new HashMap<>();
        for(String i:w){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        for(String ele:h.keySet()){
            int fre=h.get(ele);
            pq.add(new Pair(ele,fre));
            if(pq.size()>k){
                pq.remove();
            }
        }
        while (!pq.isEmpty()) {
            l.add(0,pq.poll().s);
        }
        return l;
        
    }
}