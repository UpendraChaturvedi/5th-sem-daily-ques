// Last updated: 9/4/2025, 12:07:02 PM
class Solution {
    public List<List<String>> partition(String ques) {
        List<List<String>> result = new ArrayList<>();
        partition(ques, new ArrayList<>(), result);
        return result;

        
    }

    public static void partition(String ques, List<String> current, List<List<String>> result) {
        if (ques.length() == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int c = 1; c <= ques.length(); c++) {
            String s = ques.substring(0, c);
            if (isPalindrome(s)) {
                current.add(s);
                partition(ques.substring(c), current, result);
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}