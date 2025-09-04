// Last updated: 9/4/2025, 11:58:35 AM
class Solution {
    public String findValidPair(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);

            if (first != second && freqMap.get(first) == Character.getNumericValue(first) 
                && freqMap.get(second) == Character.getNumericValue(second)) {
                return "" + first + second;
            }
        }

        return "";
        
    }
}