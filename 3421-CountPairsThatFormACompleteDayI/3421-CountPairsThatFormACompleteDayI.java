// Last updated: 9/4/2025, 11:58:59 AM
class Solution {
    public int countCompleteDayPairs(int[] h) {
        int c=0;
        int n=h.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((h[i]+h[j])%24==0){
                    c++;
                }
            }
        }
        return c;
        
    }
}