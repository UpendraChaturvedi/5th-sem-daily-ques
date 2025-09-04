// Last updated: 9/4/2025, 12:00:11 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int [n];
        int p[]=new int [n/2];
        int neg[]=new int [n-n/2];
        int k=0;
        for(int i:nums){
            if(i>0){
                p[k++]=i;
            }
        }
        k=0;
        for(int i:nums){
            if(i<0){
                neg[k++]=i;
            }
        }
        int x=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=p[x++];
            }
            else{
                ans[i]=neg[j++];
            }
        }
        return ans;
        
    }
}