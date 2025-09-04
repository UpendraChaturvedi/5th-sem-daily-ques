// Last updated: 9/4/2025, 11:58:23 AM
class Solution {
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int[] answer = new int[n];
        Arrays.fill(answer, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            answer[i] = cost[i];
            if (i > 0) answer[i] = Math.min(answer[i], answer[i - 1]); 
        }
        return answer;
    }
}