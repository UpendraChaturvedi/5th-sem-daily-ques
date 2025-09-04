// Last updated: 9/4/2025, 11:58:39 AM
class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans = -1;
        Map<Integer, Integer> subarrayCount = new HashMap<>();
        
        // Sliding window to count occurrences in subarrays of size k
        for (int i = 0; i + k <= nums.length; ++i) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i; j < i + k; ++j) {
                if (!seen.contains(nums[j])) {
                    subarrayCount.put(nums[j], subarrayCount.getOrDefault(nums[j], 0) + 1);
                }
                seen.add(nums[j]);
            }
        }
        
        // Find the largest number that appears in exactly one subarray
        for (int num : subarrayCount.keySet()) {
            if (subarrayCount.get(num) == 1) {
                ans = Math.max(ans, num);
            }
        }
        
        return ans;
        
    }
}