// Last updated: 9/4/2025, 11:59:16 AM
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long pre[]=new long[n];
        long post[]=new long[n];
        pref(nums,pre);
        postf(nums,post);
        long ans=0;
        for(int j=1;j<n-1;j++){
            ans=Math.max(ans,(pre[j-1]-nums[j])*post[j+1]);
        }
        return ans;
        
    }
    public static void pref(int nums[],long pre[]){
        long max=nums[0];
        pre[0]=max;
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            pre[i]=max;
        }

    }
    public static void postf(int nums[],long post[]){
        long max=nums[nums.length-1];
        post[nums.length-1]=max;
        for(int i=nums.length-1;i>=0;i--){
            max=Math.max(max,nums[i]);
            post[i]=max;
        }

    }
}