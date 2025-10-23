// Last updated: 10/23/2025, 8:44:39 PM
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int s=0;
        for(int i:h.keySet()){
            int v=h.get(i);
            if(v%k==0){
                s+=i*v;
            }
        }
        return s;
    }
}