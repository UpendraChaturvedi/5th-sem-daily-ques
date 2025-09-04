// Last updated: 9/4/2025, 12:03:25 PM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxSoFar = 0;
        int chunks = 0;
        for (int i = 0; i < arr.length; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]);
            if (maxSoFar == i) {
                chunks++;
            }
        }
        return chunks;
        
    }
}