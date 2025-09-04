// Last updated: 9/4/2025, 11:58:07 AM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {
                int l1 = Math.max(landStartTime[i], 0) + landDuration[i];
                int w1 = Math.max(waterStartTime[j], l1) + waterDuration[j];
                ans = Math.min(ans, w1);

                int w2 = Math.max(waterStartTime[j], 0) + waterDuration[j];
                int l2 = Math.max(landStartTime[i], w2) + landDuration[i];
                ans = Math.min(ans, l2);
            }
        }
        return ans;
        
    }
}