// Last updated: 9/4/2025, 12:05:01 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer>l1=new ArrayList<Integer>();
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                l1.add(nums[i]);
            }
        }
        return l1;
        
    }
}