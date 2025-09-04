// Last updated: 9/4/2025, 11:59:15 AM
class Solution {
    public long maximumTripletValue(int[] nums) {
        long res=0;
        int n=nums.length;
        if(n<3){
            return 0;
        }
        if(n==3){
            long ans=((long)(nums[0]-nums[1])*nums[2]);
            if(ans>0){
                return ans;
            }
            else{
                return 0;
            }
        }
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++)
            for(int k=j+1;k<n;k++){
                res=Math.max(res,((long)nums[i]-nums[j])*nums[k]);
            }
        }
        return res;
        
    }
}