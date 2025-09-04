// Last updated: 9/4/2025, 12:06:39 PM
class Solution {
    public int majorityElement(int[] arr) {
        int v=1;
        int e=arr[0];
        
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==e){
                v++;
            }
            else{
                v--;
                if(v==0){
                    e=arr[i];
                    v=1;
                }
            }
        }
        return e;
        
    }
}