// Last updated: 9/4/2025, 12:04:28 PM
class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0) nums[i]=-1;
        }
        int res=0;
        int pre=0;
        int tar=0;
        Map<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<n;i++){
            pre+=nums[i];
            if(pre==tar){
                res=i+1;
            }
            if(h.containsKey(pre)==false){
                h.put(pre,i);
            }
            if(h.containsKey(pre-tar)){
                res=Math.max(res,i-h.get(pre-tar));
            }
        }
        return res;
    }
}