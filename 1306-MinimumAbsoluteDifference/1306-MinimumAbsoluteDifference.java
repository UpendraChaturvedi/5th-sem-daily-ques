// Last updated: 9/4/2025, 12:01:58 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff == minDiff) {
                l.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return l;
    }
}
