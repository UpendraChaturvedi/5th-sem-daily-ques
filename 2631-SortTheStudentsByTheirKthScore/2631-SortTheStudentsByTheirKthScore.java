// Last updated: 9/4/2025, 11:59:37 AM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(a,b)->b[k]-a[k]);
        return score;
    }
}