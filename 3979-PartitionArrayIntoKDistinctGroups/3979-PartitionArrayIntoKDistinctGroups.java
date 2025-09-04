// Last updated: 9/4/2025, 11:57:59 AM
class Solution {
    public boolean partitionArray(int[] nums, int k) {
        HashMap<Integer,Integer>h=new HashMap<>();
        int n=nums.length;
        if(n%k !=0) return false;
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int grp=n/k;
        for(int i:h.values()){
            if(i>grp) return false;
        }
        return true;
        
    }
}