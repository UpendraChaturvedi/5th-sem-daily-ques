// Last updated: 9/4/2025, 11:59:06 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:nums){
            if(h.containsKey(i)){
                h.put(i,h.get(i)+1);
            }
            else{
                h.put(i,1);
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i:h.keySet()){
            int v=h.get(i);
            max=Math.max(v,max);
        }
        int c=0;
        for(int i:h.values()){
            if(i==max){
                c++;
            }
        }
        return c*max;
        
    }
}