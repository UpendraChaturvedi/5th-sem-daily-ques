// Last updated: 9/4/2025, 12:03:05 PM
class Solution {
    public int longestMountain(int[] arr) {
        int res=0;
        int n=arr.length;
        int ml=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                int left=i;
                int right=i;
                while(left>0 && arr[left-1]<arr[left]){
                    left--;
                }
                while(right<n-1&& arr[right+1]<arr[right]){
                    right++;
                }
                int cl=right-left+1;
                ml=Math.max(ml,cl);
            }
            

        }
        return ml;
        
    }
}