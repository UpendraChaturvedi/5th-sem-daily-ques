// Last updated: 9/4/2025, 11:58:04 AM
class Solution {
    static int MOD=1000000007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        long ans []=new long [n];
        Arrays.fill(ans, 1);
        for(int q[]:queries){
            int n1=q[0];
            int n2=q[1];
            int n3=q[2];
            int n4=q[3];
            for(int i=n1;i<=n2;i+=n3){
                ans[i]=(ans[i]*n4)%MOD;
            }
            
        }
        int an=0;
        for(int i=0;i<n;i++){
            long val=(nums[i]*ans[i])%MOD;
            an^=val;
        }
        return an;
    }
}