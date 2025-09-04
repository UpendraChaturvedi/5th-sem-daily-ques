// Last updated: 9/4/2025, 12:00:21 PM
class Solution {
    public boolean winnerOfGame(String s) {
        int a = 0, b = 0;
        int n = s.length();
        
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == 'A' && s.charAt(i - 1) == 'A' && s.charAt(i + 1) == 'A') {
                a++;
            }
            if (s.charAt(i) == 'B' && s.charAt(i - 1) == 'B' && s.charAt(i + 1) == 'B') {
                b++;
            }
        }
        
        return a > b;
        
    }
}