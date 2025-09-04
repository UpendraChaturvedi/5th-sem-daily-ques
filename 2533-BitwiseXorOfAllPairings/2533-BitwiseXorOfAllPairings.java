// Last updated: 9/4/2025, 11:59:43 AM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int result=0;
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1%2!=0){
            for(int i:nums2){
                result^=i;
            }
        }
        if(n2%2!=0){
            for(int i:nums1){
                result^=i;
            }
        }
        return result;
        
    }
}