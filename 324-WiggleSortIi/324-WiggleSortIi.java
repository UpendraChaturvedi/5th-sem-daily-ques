// Last updated: 9/4/2025, 12:05:39 PM
class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int arr[]=new int [n];
        int l=(n-1)/2;
        int r=n-1;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                arr[i]=nums[r--];
            }
            else{
                arr[i]=nums[l--];
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}