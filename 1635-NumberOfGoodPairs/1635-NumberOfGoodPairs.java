// Last updated: 9/4/2025, 12:01:22 PM
class Solution {
    public int numIdenticalPairs(int[] arr) {
        int c=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
        }
        return c;
    }
}