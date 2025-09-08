// Last updated: 9/8/2025, 10:54:22 PM
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n=arr.length;
        int k=0;
        int mxl=0;
        int l=0;
        while(k<n-1){
            if(k%2!=0){
                if(arr[k]>arr[k+1]){
                    k++;
                    l++;
                    mxl=Math.max(mxl,l);
                }
                else{
                    l=0;
                    k++;
                }
            }
            else {
                if(arr[k]<arr[k+1]){
                    k++;
                    l++;
                    mxl=Math.max(mxl,l);
                }
                else{
                    l=0;
                    k++;
                }
            }
        }
        k=0;
        l=0;
        int mxl1=0;
        while(k<n-1){
            if(k%2==0){
                if(arr[k]>arr[k+1]){
                    k++;
                    l++;
                    mxl1=Math.max(mxl1,l);
                }
                else{
                    l=0;
                    k++;
                }
            }
            else {
                if(arr[k]<arr[k+1]){
                    k++;
                    l++;
                    mxl1=Math.max(mxl1,l);
                }
                else{
                    l=0;
                    k++;
                }
            }
        }
        return Math.max(mxl,mxl1)+1;
    }
}