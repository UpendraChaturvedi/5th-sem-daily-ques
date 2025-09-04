// Last updated: 9/4/2025, 12:00:29 PM
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        
        for (String num : nums) {
            set.add(Integer.parseInt(num, 2));
        }
        
        for (int i = 0; i <= (1 << n); i++) { 
            if (!set.contains(i)) {
                String res = Integer.toBinaryString(i);
                while (res.length() < n) {  
                    res = "0" + res;
                }
                return res;
            }
        }
        
        return "";
        
    }
}