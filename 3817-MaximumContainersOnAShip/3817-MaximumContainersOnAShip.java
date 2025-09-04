// Last updated: 9/4/2025, 11:58:27 AM
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int mx=n*n;
        int l=maxWeight/w;
        return Math.min(mx,l);
        
    }
}