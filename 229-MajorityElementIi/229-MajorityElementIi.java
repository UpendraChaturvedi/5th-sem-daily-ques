// Last updated: 9/4/2025, 12:06:10 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>h=new HashMap<>();
        int c=nums.length/3;
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:h.keySet()){
            int v=h.get(i);
            if(v>c){
                l.add(i);
            }
        }
        return l;
    }
}