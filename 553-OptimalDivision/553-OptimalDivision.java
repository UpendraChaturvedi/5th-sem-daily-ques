// Last updated: 9/4/2025, 12:04:18 PM
class Solution {
    public String optimalDivision(int[] nums) {
        int n=nums.length;
        if (n == 1) return Integer.toString(nums[0]);
        if (n == 2) return nums[0] + "/" + nums[1];
        StringBuilder s=new StringBuilder();
        s.append(nums[0]);
        s.append('/');
        s.append('(');
        for(int i=1;i<n;i++){
            if(i!=n-1){
                s.append(nums[i]);
                s.append('/');
            }
        }
        s.append(nums[n-1]);
        s.append(')');
        return s.toString();
    }
}