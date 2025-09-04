// Last updated: 9/4/2025, 12:03:50 PM
class Solution {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr.length == k){
            for(int i = 0; i < k; i++){
                ans.add(arr[i]);
            }
            return ans;
        }
        int minDiffIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(minDiffIndex == -1) minDiffIndex = i;
            else{
                if(Math.abs(arr[i]-x) < Math.abs(arr[minDiffIndex]-x)) minDiffIndex = i;
            }
        }
        ans.add(arr[minDiffIndex]);
        k--;
        int i = -1, j = -1;
        if(minDiffIndex >= 0 && minDiffIndex < arr.length){
            i = minDiffIndex-1;
            j = minDiffIndex+1;
            while(k-- > 0){
                if(i >= 0 && j < arr.length && (Math.abs(arr[i]-x) <= Math.abs(arr[j]-x))){
                    ans.add(arr[i--]);
                }
                else if(i >= 0 && j < arr.length && (Math.abs(arr[i]-x) > Math.abs(arr[j]-x))){
                    ans.add(arr[j++]);
                }
                else if(i < 0){
                    ans.add(arr[j++]);
                }
                else{
                    ans.add(arr[i--]);
                }
            }
        }
        else if(minDiffIndex >= 0){
            i = minDiffIndex-1;
            while(k-- > 0){
                ans.add(arr[i--]);
            }
        }
        else{
            j = minDiffIndex+1;
            while(k-- > 0){
                ans.add(arr[j++]);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}