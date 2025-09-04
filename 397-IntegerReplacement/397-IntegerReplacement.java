// Last updated: 9/4/2025, 12:05:15 PM
class Solution {
    public int integerReplacement(int n) {
        long num = n; 
        int opr = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                if ((num + 1) % 4 == 0 && num != 3) {
                    num++;
                } else {
                    num--;
                }
            }
            opr++;
        }
        return opr;
    }
}
