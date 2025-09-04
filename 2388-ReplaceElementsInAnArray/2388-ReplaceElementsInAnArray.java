// Last updated: 9/4/2025, 11:59:58 AM
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer>h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            h.put(nums[i],i);
        }
        for(int []p:operations){
            int n1=p[0];
            int n2=p[1];
            int ind=0;
            if(h.containsKey(n1)){
                ind=h.get(n1);
            }
            nums[ind]=n2;
            h.remove(n1);
            h.put(n2,ind);
        }
        return nums;
    }
}