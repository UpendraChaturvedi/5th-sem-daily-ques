// Last updated: 9/4/2025, 11:59:05 AM
class Solution {
    public String triangleType(int[] nums) {
        if(nums[0] + nums[1] <= nums[2] || nums[1] + nums[2] <= nums[0] || nums[0] + nums[2] <= nums[1]){return"none"; 
        } 
   

        HashSet<Integer>h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        if(h.size()==1) return "equilateral";
        if(h.size()==2) return "isosceles";
        else return "scalene";
    }
}