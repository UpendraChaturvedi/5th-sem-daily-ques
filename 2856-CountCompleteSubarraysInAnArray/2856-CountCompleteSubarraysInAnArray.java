// Last updated: 9/4/2025, 11:59:21 AM
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        int c=0;
        for(int i=0;i<n;i++){
            HashSet<Integer>h1=new HashSet<>();
            for(int j=i;j<n;j++){
                h1.add(nums[j]);
                if(h1.size()==h.size()){
                    c++;
                }
            }
        }
        return c;
    }
}