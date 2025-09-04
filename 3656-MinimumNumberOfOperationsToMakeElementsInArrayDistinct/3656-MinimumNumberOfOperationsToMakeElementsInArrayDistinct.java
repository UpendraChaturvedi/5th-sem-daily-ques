// Last updated: 9/4/2025, 11:58:42 AM
class Solution {
    public int minimumOperations(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }

        int c = 0;

        while (true) {
            Set<Integer> set = new HashSet<>(arr);
            if (set.size() == arr.size()) {
                break;
            }

            int removeCount = Math.min(3, arr.size());
            for (int i = 0; i < removeCount; i++) {
                arr.remove(0);
            }

            c++;
        }

        return c;
        
    }
}