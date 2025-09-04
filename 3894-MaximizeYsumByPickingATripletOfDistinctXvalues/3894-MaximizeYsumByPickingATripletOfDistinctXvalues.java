// Last updated: 9/4/2025, 11:58:14 AM
class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer, Integer> maxYMap = new HashMap<>();
        int n = x.length;
        for (int i = 0; i < n; i++) {
            maxYMap.put(x[i], Math.max(maxYMap.getOrDefault(x[i], 0), y[i]));
        }
        if (maxYMap.size() < 3) return -1;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(maxYMap.values());
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += maxHeap.poll();
        }
        return sum;
    }
}