// Last updated: 9/4/2025, 12:03:40 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int ans=0,si=0,ei=0,p=1;
        while(ei<arr.length){
            p=p*arr[ei];
            while(p>=k&&si<=ei){
                p=p/arr[si];
                si++;
            }
            ans=ans+(ei-si+1);
            ei++;
        }
        return ans;
        
    }
}