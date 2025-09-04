// Last updated: 9/4/2025, 11:58:24 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        int d1=Math.abs(z-y);
        int d2=Math.abs(z-x);
        if(d1==d2) return 0;
        if(d1<d2) return 2;
        else return 1;
    }
}