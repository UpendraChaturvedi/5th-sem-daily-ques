// Last updated: 9/4/2025, 12:06:47 PM
class Solution {
    public int maxProduct(int[] arr) {
        int pre=1;
        int suf=1;
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            pre=pre*arr[i];
            suf=suf*arr[n-i-1];
            maxi=Math.max(maxi,Math.max(pre,suf));
        }
        return maxi;
        
    }
}