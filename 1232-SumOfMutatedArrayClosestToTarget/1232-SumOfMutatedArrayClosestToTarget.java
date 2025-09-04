// Last updated: 9/4/2025, 12:02:07 PM
class Solution {
    public int findBestValue(int[] arr, int t) {
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(i,max);
        }
        int l=0;
        int ans=0;
        int h=max;
        int minDiff = Integer.MAX_VALUE;
        while(l<=h){
            int m=l+(h-l)/2;
            int s=calc(arr,m);
            int diff = Math.abs(s - t);
            if (diff < minDiff || (diff == minDiff && m < ans)) {
                ans = m;
                minDiff = diff;
            }
            if(s>t){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    public static int calc(int []arr,int m){
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                s += m;
            } else {
                s += arr[i];
            }
        }
        return s;
    }
}