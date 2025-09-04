// Last updated: 9/4/2025, 12:01:31 PM
class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int c=0;
        HashSet<Character> h = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int n=s.length();
        
            while(j<k){
                if(h.contains(s.charAt(j))){
                    c++;
                }
                j++;
            }
            int max=c;
            while(j<n){
                if(h.contains(s.charAt(j))){
                    c++;
                }
                if(h.contains(s.charAt(i))){
                    c--;
                }
                max=Math.max(c,max);
                i++;
                j++;
            }
            return max;
    
    }
}