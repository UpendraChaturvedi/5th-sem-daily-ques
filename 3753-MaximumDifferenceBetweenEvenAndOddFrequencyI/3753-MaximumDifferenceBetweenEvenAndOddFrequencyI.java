// Last updated: 9/4/2025, 11:58:32 AM
class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>h=new HashMap<>();
        for(char c:s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:h.values()){
            if(i%2==0) min=Math.min(i,min);
            
            else max=Math.max(i,max);
        }
        return max-min;
    }
}