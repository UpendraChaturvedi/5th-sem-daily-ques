// Last updated: 9/4/2025, 12:04:26 PM
class Solution {
    public int findPairs(int[] nums, int k) {
        int c=0;
        HashSet<String>s=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && (Math.abs(nums[i]-nums[j])==k)){
                    int a = Math.min(nums[i], nums[j]);
                    int b = Math.max(nums[i], nums[j]);
                    s.add(a+","+b);
                }
            }
        }
        return s.size();
    }
}