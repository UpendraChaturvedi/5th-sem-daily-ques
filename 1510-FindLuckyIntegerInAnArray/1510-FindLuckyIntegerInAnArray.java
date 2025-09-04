// Last updated: 9/4/2025, 12:01:35 PM
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int mx=-1;
        for(int i:h.keySet()){
            if(i==h.get(i) && i>mx){
                mx=i;
            }
        }
        return mx;
    }
}