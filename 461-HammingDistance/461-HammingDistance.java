// Last updated: 9/4/2025, 12:04:49 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int num=x^y;
        int count = Integer.bitCount(num);
        return count;
        
    }
}