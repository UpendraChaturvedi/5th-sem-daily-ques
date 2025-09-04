// Last updated: 9/4/2025, 12:00:13 PM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i += k) {
            int end = Math.min(i + k, s.length());
            String part = s.substring(i, end);
            while (part.length() < k) {
                part += fill;
            }
            
            list.add(part);
        }
        return list.toArray(new String[0]);

        
    }
}