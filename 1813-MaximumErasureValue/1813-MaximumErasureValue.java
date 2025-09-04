// Last updated: 9/4/2025, 12:01:02 PM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0;
        int j=0;
        int ms=0;
        int s=0;
        HashMap<Integer,Integer>h=new HashMap<>();
        int n=nums.length;
        while(j<n){
            if(h.containsKey(nums[j])){
                while(h.containsKey(nums[j])){
                    s-=nums[i];
                    h.remove(nums[i]);
                    i++;
                }
            }
            s+=nums[j];
            ms=Math.max(ms,s);
            h.put(nums[j],1);
            j++;
        }
        return ms;
    }
}