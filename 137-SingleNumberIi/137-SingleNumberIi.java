// Last updated: 9/4/2025, 12:06:57 PM
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int x:nums){
            if(m.containsKey(x)){
                m.put(x,m.get(x)+1);
            }
            else{
                m.put(x,1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:m.entrySet()){
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
        
    }
}