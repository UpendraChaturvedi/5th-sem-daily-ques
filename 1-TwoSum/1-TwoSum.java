// Last updated: 9/4/2025, 12:08:57 PM
class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(t-nums[i])){
                return new int []{i,h.get(t-nums[i])};
            }else{
                h.put(nums[i],i);
            }
        }
        return new int []{};
        
    }
}