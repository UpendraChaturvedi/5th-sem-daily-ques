// Last updated: 9/4/2025, 12:01:34 PM
class Solution {
    public int minStartValue(int[] nums) {
        // int idx=0;
        int n=nums.length;
        // for(int l=0;l<=1000;l++){
        //     int s=l;
        //     for(int i=0;i<n;i++){
        //         s+=nums[i];
        //         if(s<n) break;
        //         if(i==n && s>1){
        //             idx=l;
        //             break;
        //         }
        //     }
        // }
        // return idx;
        int pre[]=new int [n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        int max=Integer.MAX_VALUE;
        for(int i:pre){
            max=Math.min(i,max);
        }
        return (max<1)?Math.abs(max)+1:1;

    }
}