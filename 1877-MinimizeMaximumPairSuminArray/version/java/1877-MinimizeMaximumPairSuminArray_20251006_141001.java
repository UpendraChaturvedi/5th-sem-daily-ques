// Last updated: 10/6/2025, 2:10:01 PM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0;
        int h=n-1;
        int mx=-1;
        while(l<h){
            int s=nums[l]+nums[h];
            if(s>mx){
                mx=s;
            }
            l++;
            h--;
        }
        return mx;
    }
}