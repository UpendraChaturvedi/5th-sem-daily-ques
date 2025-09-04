// Last updated: 9/4/2025, 12:04:13 PM
class Solution {
    public int distributeCandies(int[] c) {
        int n=c.length;
        HashSet<Integer>h=new HashSet<>();
        for(int i:c){
            h.add(i);
        }
        return Math.min(n/2,h.size());
        
    }
}