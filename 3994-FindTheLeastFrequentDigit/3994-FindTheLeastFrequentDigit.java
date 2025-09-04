// Last updated: 9/4/2025, 11:58:00 AM
class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer>h=new HashMap<>();
        String s=n+"";
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i)-'0',h.getOrDefault(s.charAt(i)-'0',0)+1);
        }
        int min=Integer.MAX_VALUE;
        int freq=Integer.MAX_VALUE;
        for(int i:h.keySet()){
            int v=h.get(i);
            if(v<freq){
                freq=v;
                min=i;
            }
        }
        return min;
    }
}