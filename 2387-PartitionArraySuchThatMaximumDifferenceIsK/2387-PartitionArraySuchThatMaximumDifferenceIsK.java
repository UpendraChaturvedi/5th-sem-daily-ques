// Last updated: 9/4/2025, 11:59:59 AM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        int n=nums.length;
        int i=0;
        while(i<n){
            int j=i+1;
            while(j<n && ((nums[j]-nums[i])<=k)){
                j++;
            }
            c++;
            i=j;
        }
        return c;
    }
}