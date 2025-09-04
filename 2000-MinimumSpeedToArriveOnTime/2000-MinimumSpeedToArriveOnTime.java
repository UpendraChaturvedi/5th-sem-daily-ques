// Last updated: 9/4/2025, 12:00:44 PM
class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l = 1;
        int h = 10000000;
        int ans = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (ispossible(dist, hour, m)) {
                ans = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    public static boolean ispossible(int[] dist, double h, int m) {
        double s = 0;
        for (int i = 0; i < dist.length; i++) {
            if (i != dist.length - 1) {
                s += Math.ceil((double) dist[i] / m);
            } else {
                s += (double) dist[i] / m;
            }
        }
        return s <= h;
    }
}
