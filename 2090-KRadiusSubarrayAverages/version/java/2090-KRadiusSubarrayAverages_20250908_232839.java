// Last updated: 9/8/2025, 11:28:39 PM
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int ans []=new int [n];
        long pre[]=new long [n];
        Arrays.fill(ans,-1);
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        for(int i=k;i<n-k;i++){
            // int diff=pre[i+k]-pre[i-k];
            // ans[i]=diff/(2*k+1);
            long total = pre[i + k] - (i - k > 0 ? pre[i - k - 1] : 0);
            ans[i] = (int)(total / (2 * k + 1));
        }
        return ans;
    }
}