// Last updated: 9/4/2025, 12:05:02 PM
class Solution {
    public int arrangeCoins(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5); 
    }
}