// Last updated: 9/4/2025, 12:00:06 PM
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        
        HashSet<Integer>h=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[j]==key && Math.abs(i-j)<=k){
                    h.add(i);
                }
            }
        }
        List<Integer>l=new ArrayList<>(h);
        Collections.sort(l);
        return l;
    }
}