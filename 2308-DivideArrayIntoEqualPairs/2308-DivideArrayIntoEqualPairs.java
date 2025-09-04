// Last updated: 9/4/2025, 12:00:07 PM
class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int j:h.values()){
            if(j%2!=0){
                return false;
            }
        }
        return true;
        
    }
}