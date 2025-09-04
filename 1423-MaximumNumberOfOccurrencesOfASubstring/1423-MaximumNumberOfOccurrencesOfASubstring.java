// Last updated: 9/4/2025, 12:01:47 PM
class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int n=s.length();
        HashMap<String,Integer>h=new HashMap<>();
        int c=0;
        int max=0;
        for(int i=0;i<=n-minSize;i++){
            for(int j=minSize;j<=maxSize&&i+j <= n;j++){
                String sn=s.substring(i,i+j);
                if(isval(sn,maxLetters)){
                    h.put(sn,h.getOrDefault(sn,0)+1);
                    max=Math.max(max,h.get(sn));
                }
            }
        }
        return max;
    }
    public static boolean isval(String s,int m){
        HashSet<Character>h=new HashSet<>();
        for(int i=0;i<s.length();i++){
            h.add(s.charAt(i));
        }
        return h.size()<=m;
    }
}