// Last updated: 9/4/2025, 12:04:22 PM
class Solution {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) {
            return 0;
        }

        List<Integer> minutes = new ArrayList<>();
        for (String time : timePoints) {
            String[] parts = time.split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            minutes.add(hour * 60 + minute);
        }
        Collections.sort(minutes);
        int minDiff = Integer.MAX_VALUE;
        int TOTAL_MINUTES_IN_DAY = 1440;
        for (int i = 1; i < minutes.size(); i++) {
            int diff = minutes.get(i) - minutes.get(i - 1);
            minDiff = Math.min(minDiff, diff);
        }
        int circularDiff = TOTAL_MINUTES_IN_DAY + minutes.get(0) - minutes.get(minutes.size() - 1);
        minDiff = Math.min(minDiff, circularDiff);

        return minDiff;
        
    }
}