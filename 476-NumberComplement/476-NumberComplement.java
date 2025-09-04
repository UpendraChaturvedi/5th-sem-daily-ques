// Last updated: 9/4/2025, 12:04:44 PM
class Solution {
    public int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        return num ^ mask;
        
    }
}