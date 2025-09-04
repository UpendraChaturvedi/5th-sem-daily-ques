// Last updated: 9/4/2025, 12:08:18 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int n:nums){
            
            h.add(n);
            
        }
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i)){
                return i;
            }
        }
        return nums.length+1;
        
    }
}