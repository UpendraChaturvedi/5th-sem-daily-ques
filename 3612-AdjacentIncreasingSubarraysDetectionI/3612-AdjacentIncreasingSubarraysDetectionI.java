// Last updated: 9/4/2025, 11:58:46 AM
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        for(int i=0;i<=n-2*k;i++){
            if(isinc(nums,i,k)&&(isinc(nums,i+k,k))){
                return true;
            }
        }
        return false;
        
    }
    private boolean isinc(List<Integer> nums, int start,int k){
        for(int j=start;j<start+k-1;j++){
            if(nums.get(j)>=nums.get(j+1)){
                return false;
            }
            
        }
        return true;
    }
}