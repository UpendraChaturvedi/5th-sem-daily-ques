// Last updated: 9/4/2025, 11:58:22 AM
class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = dsum(nums[i]);
            arr[i][1] = nums[i];
            arr[i][2] = i;
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        boolean[] vis = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] || arr[i][2] == i) continue;

            int j = i, cnt = 0;
            while (!vis[j]) {
                vis[j] = true;
                j = arr[j][2];
                cnt++;
            }
            res += cnt - 1;
        }

        return res;
    }
    public int dsum(int x) {
        int s = 0;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        return s;
        
    }
}