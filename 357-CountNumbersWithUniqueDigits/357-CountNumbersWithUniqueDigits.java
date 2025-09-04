// Last updated: 9/4/2025, 12:05:28 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int count = 0;
        int upper = (int)Math.pow(10, n);
        for (int i = 0; i < upper; i++) {
            if (hasUniqueDigits(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean hasUniqueDigits(int num) {
        boolean[] seen = new boolean[10];
        while (num > 0) {
            int d = num % 10;
            if (seen[d]) return false;
            seen[d] = true;
            num /= 10;
        }
        return true;
    }
}
