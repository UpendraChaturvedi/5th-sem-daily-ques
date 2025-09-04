// Last updated: 9/4/2025, 11:59:32 AM
class Solution {
    public long findScore(int[] nums) {
        int n=nums.length;
        int mar[]=new int [n];
        int arr[][]=new int [n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        long sc=0;
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        for(int p[]:arr){
            int val=p[0];
            int idx=p[1];
            if(mar[idx]==0){
                sc+=val;
                mar[idx]=1;
                if(idx-1>=0) mar[idx-1]=1;
                if(idx+1<n) mar[idx+1]=1;
            }
        }
        return sc;
    }
}