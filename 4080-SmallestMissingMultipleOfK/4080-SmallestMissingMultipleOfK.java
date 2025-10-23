// Last updated: 10/23/2025, 8:44:36 PM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        for(int i=k;;i+=k){
            if(!h.contains(i)){
                return i;
            }
        }
        // return -1;
    }
}