// Last updated: 9/4/2025, 12:00:23 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(String s:operations){
            if(s.equals("--X") || s.equals("X--")){
                ans--;
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}