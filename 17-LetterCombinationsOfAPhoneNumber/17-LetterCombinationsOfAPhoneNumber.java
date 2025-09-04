// Last updated: 9/4/2025, 12:08:41 PM


class Solution {
    static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        generateCombinations(digits, "", result);
        return result;
    }

    private void generateCombinations(String digits, String current, List<String> result) {
        if (digits.isEmpty()) {
            result.add(current);
            return;
        }
        String letters = key[digits.charAt(0) - '0'];
        for (char letter : letters.toCharArray()) {
            generateCombinations(digits.substring(1), current + letter, result);
        }
    }
}
