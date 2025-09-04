// Last updated: 9/4/2025, 12:01:43 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int s=0,c=0,i=0,j=k-1;
        for(int x=0;x<k;x++){
            s+=arr[x];
        }
        if(s/k>=t) c++;
        i++;
        j++;
        while(j<arr.length){
            s=s-arr[i-1]+arr[j];
            if(s/k>=t) c++;
            i++;
            j++;
        }
        return c;
    }
}