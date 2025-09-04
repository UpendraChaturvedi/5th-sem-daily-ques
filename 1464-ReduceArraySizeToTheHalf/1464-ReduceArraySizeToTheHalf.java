// Last updated: 9/4/2025, 12:01:40 PM
import java.util.*;

class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> frequencies = new ArrayList<>(freqMap.values());
        Collections.sort(frequencies, Collections.reverseOrder());
        int removed = 0;
        int setSize = 0;
        int halfSize = arr.length / 2;
        for (int freq : frequencies) {
            removed += freq;
            setSize++;
            if (removed >= halfSize) {
                break;
            }
        }
        return setSize;
    }
}
