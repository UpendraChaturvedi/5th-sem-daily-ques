// Last updated: 9/4/2025, 12:01:53 PM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] % 2;
        }
        int c = 0;
        int pre = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0, 1);
        for (int i : nums) {
            pre += i;
            if (h.containsKey(pre - k)) {
                c += h.get(pre - k);
            }
            h.put(pre, h.getOrDefault(pre, 0) + 1);
        }
        return c;
        
    }
}