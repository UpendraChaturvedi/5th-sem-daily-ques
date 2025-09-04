// Last updated: 9/4/2025, 12:03:39 PM
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        // int i=0;
        // int j=0;
        // int maxlen=0;
        // while(i<n){
        //     while(j<m){
        //         if(nums1[i]==nums2[j]){
        //             j++;
        //             i++;
        //             maxlen=Math.max(maxlen,j-i+1);
        //         }
        //         else{
        //             j=0;

        //         }
        //     }
        // }
        // return maxlen;
        int n = nums1.length;
        int m = nums2.length;
        int maxlen = 0;
        for (int i =0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int len = 0;
                int a = i;
                int b = j;
                while (a < n && b < m && nums1[a] == nums2[b]) {
                    len++;
                    a++;
                    b++;
                }
                maxlen = Math.max(maxlen, len);
            }
        }

        return maxlen;
    }
}