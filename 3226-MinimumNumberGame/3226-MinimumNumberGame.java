// Last updated: 9/4/2025, 11:59:10 AM
class Solution {
    public int[] numberGame(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int num : nums) {
            a.add(num);
        }

        ArrayList<Integer> b = new ArrayList<>();
        Collections.sort(a);
        
        while (!a.isEmpty()) {
            int r1 = a.remove(0);
            int r2 = a.remove(0);
            b.add(r2);
            b.add(r1);
        }
        
        int ans[] = new int[b.size()];
        for (int i = 0; i < b.size(); i++) {
            ans[i] = b.get(i);
        }
        return ans;
        
    }
}