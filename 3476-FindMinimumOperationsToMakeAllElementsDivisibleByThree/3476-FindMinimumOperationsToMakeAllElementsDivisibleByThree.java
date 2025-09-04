// Last updated: 9/4/2025, 11:58:51 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int x = 0;
        for (int i : nums) {
            if (i % 3 != 0) {
                x++;
            }
        }
        return x;
    }
}