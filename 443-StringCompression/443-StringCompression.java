// Last updated: 9/4/2025, 12:05:00 PM
class Solution {
    public int compress(char[] chars) {
        String s = ""; // Using a string to build the result
        s += chars[0]; // Start with the first character
        int c = 1;     // Initialize count
        int n = chars.length;

        for (int i = 1; i < n; i++) {
            char curr = chars[i];   // Current character
            char prev = chars[i - 1]; // Previous character

            if (curr == prev) {
                c++; // Increment count if characters are the same
            } else {
                if (c > 1) {
                    s += c; // Append count if it's greater than 1
                }
                s += curr; // Append the current character
                c = 1;     // Reset count
            }
        }

        // Append the last count if needed
        if (c > 1) {
            s += c;
        }

        // Update the original array
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        return s.length();
    }
}
