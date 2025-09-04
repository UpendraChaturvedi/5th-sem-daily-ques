// Last updated: 9/4/2025, 12:02:18 PM
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            p.add(i);
        }
        
        while(p.size()>1){
            int n1=p.poll();
            int n2=p.poll();
            if(n1!=n2){
                p.add(Math.abs(n1-n2));
            }
        }
        // return p.peek();
        return p.isEmpty() ? 0 : p.peek();
    }
}