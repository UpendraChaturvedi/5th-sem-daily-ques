// Last updated: 9/4/2025, 11:58:12 AM
class Solution {
    public int minSensors(int n, int m, int k) {
        int ans=(int)Math.ceil((double)n/(2*k+1)) *(int)Math.ceil((double)m/(2*k+1));
        return ans;
    }
}