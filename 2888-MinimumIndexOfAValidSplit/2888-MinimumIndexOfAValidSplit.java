// Last updated: 9/4/2025, 11:59:19 AM
class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:nums){
            if(h.containsKey(i)){
                h.put(i,h.get(i)+1);
            }
            else{
                h.put(i,1);
            }
        }
        int dom=-1;
        for(int v:h.keySet()){
            if(h.get(v)>=nums.size()/2){
                dom=v;
            }
        }
        int lco=0;
        int rco=h.get(dom);
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)==dom){
                lco++;
                rco--;
            }
            if(lco*2>(i+1) && rco*2>nums.size()-i-1){
                return i;
            }
        }
        return -1;
        
    }
}