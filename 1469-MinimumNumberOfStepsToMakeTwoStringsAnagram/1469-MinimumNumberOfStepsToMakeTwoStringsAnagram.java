// Last updated: 9/4/2025, 12:01:39 PM
class Solution {
    public int minSteps(String s, String t) {
       int freq[]=new int [26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        
        for(char c:t.toCharArray()){
           freq[c-'a']--;
        }
        int st=0;
        for(int i=0;i<26;i++){
            if(freq[i]<0)st+=Math.abs(freq[i]);
        }
        return st;
    }
}