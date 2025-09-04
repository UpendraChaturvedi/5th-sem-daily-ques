// Last updated: 9/4/2025, 11:59:17 AM
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c = 0;
        for (int i = low; i <= high; i++) {
            String a = i + "";
            int s = 0;
            int sf = 0;
            int sl = 0;
            int e = a.length() - 1;
            if ((e + 1) % 2 == 0) {
                while (s < e) {
                    sf += a.charAt(s) - '0';
                    sl += a.charAt(e) - '0';
                    s++;
                    e--;
                }
                if (sf == sl) {
                    c++;
                }
            }
        }
        return c;
        
    }
}