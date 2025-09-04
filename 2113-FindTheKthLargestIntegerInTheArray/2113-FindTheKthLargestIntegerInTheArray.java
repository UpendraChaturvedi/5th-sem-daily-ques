// Last updated: 9/4/2025, 12:00:28 PM
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> minHeap = new PriorityQueue<>(
            (a, b) -> new java.math.BigInteger(a).compareTo(new java.math.BigInteger(b))
        );

        for (String num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }

        return minHeap.peek();
    }
}