// Last updated: 9/4/2025, 12:00:19 PM
class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }

        int[] count = new int[1];
        generate(nums, 0, 0, count, maxOr);
        return count[0];
    }

    public void generate(int[] nums, int index, int currOr, int[] count, int maxOr) {
        if (index == nums.length) {
            if (currOr == maxOr) {
                count[0]++;
            }
            return;
        }
        generate(nums, index + 1, currOr | nums[index], count, maxOr);
        generate(nums, index + 1, currOr, count, maxOr);
        
    }
}