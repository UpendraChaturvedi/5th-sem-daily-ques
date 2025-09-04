// Last updated: 9/4/2025, 12:00:05 PM
class Solution {
    public int minBitFlips(int start, int goal) {
        int n=start^goal;
        int i=0;
        int flips=0;
        while(i<32){
            if ((n&(1 << i))!=0) {
                flips++;
            }
            i++;
        }
        return flips;
    }
}