// Last updated: 9/4/2025, 12:00:24 PM
class Solution {
    public int numOfPairs(String[] nums, String t) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<n;j++){
                if (i != j) {
                    String ne = nums[i] + nums[j];
                    if (ne.equals(t)) {
                        c++;
                    }
                }
            }
        }
        return c;
    }
}