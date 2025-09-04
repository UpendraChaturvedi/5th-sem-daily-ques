// Last updated: 9/4/2025, 12:01:05 PM
class Solution {
    public int maximumWealth(int[][] a) {
        int res=0;
        for(int []i:a){
            int s=0;
            for(int j:i){
                s+=j;
            }
            res=Math.max(res,s);
        }
        return res;
        
    }
}