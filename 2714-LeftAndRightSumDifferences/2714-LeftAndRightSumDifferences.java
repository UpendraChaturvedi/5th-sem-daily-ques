// Last updated: 9/4/2025, 11:59:30 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int left[]=new int [n];
        for(int i=1;i<n;i++){
            int s=0;
            for(int j=0;j<i;j++){
                s+=nums[j];
            }
            left[i]=s;
        }
        int right[]=new int [n];
        for(int i=n-2;i>=0;i--){
            int s1=0;
            for(int j=i+1;j<n;j++){
                s1+=nums[j];
            }
            right[i]=s1;
        }
        int fin[]=new int [n];
        for(int i=0;i<n;i++){
            fin[i]=Math.abs(left[i]-right[i]);
        }
        return fin;
    }
}