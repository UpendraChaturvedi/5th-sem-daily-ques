// Last updated: 9/4/2025, 12:00:08 PM
class Solution {
    public long minimumTime(int[] t, int tot) {
        long l = 1;
        long maxTime = 0;
        for (int time : t) {
            if (time > maxTime) maxTime = time;
        }
        long h = maxTime * (long) tot;  // max possible time
        long ans = -1;
        while (l <= h) {
            long m = l + (h - l) / 2;
            if (ispossible(t, tot, m)) {
                ans = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    public static boolean ispossible(int[] t, int tot, long m) {
        long s = 0;
        for (int time : t) {
            s += m / time;
            if (s >= tot) return true;
        }
        return s >= tot;
    }
}
