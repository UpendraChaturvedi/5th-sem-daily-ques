// Last updated: 8/30/2025, 2:50:53 AM
class Solution {
    class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele,int freq){
            this.ele=ele;
            this.freq=freq;
        }
        public int compareTo(Pair o){
            return this.freq - o.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        for(int i:h.keySet()){
            pq.add(new Pair(i,h.get(i)));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int []ans=new int [pq.size()];
        int j=0;
        while(pq.size()!=0){
            ans[j++]=pq.poll().ele;
        }
        return ans;
        

    }
}