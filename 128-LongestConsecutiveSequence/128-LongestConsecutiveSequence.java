// Last updated: 9/4/2025, 12:07:04 PM
class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0) return 0;
        Arrays.sort(arr);
            int curr=1;
            int res=1;
            int n=arr.length;
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]+1){
                    curr++;
                }
                else if(arr[i]!=arr[i-1]){
                    res=Math.max(res,curr);
                    curr=1;
                }
            }
        
        return Math.max(res,curr);
        
    }
}