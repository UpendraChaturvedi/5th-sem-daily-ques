// Last updated: 9/4/2025, 12:07:36 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int [m+n];
        int k=0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<m){
            arr[k++]=nums1[i++];
        }
        while(j<n){
            arr[k++]=nums2[j++];
        }
        for(int c=0;c<m+n;c++){
            nums1[c]=arr[c];
        }
        
    }
}