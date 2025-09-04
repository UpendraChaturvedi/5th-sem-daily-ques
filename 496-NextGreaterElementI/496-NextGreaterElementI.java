// Last updated: 9/4/2025, 12:04:39 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            int next=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[k]>nums2[j]){
                            next=nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            arr[i]=next;
        }
        return arr;
    }
}