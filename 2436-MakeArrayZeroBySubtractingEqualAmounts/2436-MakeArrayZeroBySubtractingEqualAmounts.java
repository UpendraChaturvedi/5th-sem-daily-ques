// Last updated: 9/4/2025, 11:59:55 AM
class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums){
            if(i>0){
                h.add(i);
            }
        }
        return h.size();
        
    }
}