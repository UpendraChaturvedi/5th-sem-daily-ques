// Last updated: 10/23/2025, 8:44:37 PM
class Solution {
    public int longestBalanced(String s) {
        int len=0;
        int n=s.length();
        // HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<n;i++){
            int freq[]=new int [26];
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                freq[c-'a']++;
                if(iseq(freq)){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public static boolean iseq(int []freq){
        int t=0;
        for(int i:freq){
            if(i!=0){
                if(t==0) t=i;
                else if(i!=t)return false;
            }
        }
        return true;
    }
}