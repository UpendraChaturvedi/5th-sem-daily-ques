// Last updated: 9/4/2025, 12:01:26 PM
class Solution {
    public int minDays(int[] bloom, int m, int k) {
        if ((long)m * k > bloom.length) return -1;
        int l = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;
        for (int i : bloom) {
            l = Math.min(l, i);
            h = Math.max(h, i);
        }
        int ans=-1;
        while(l<=h){
            int mi=l+(h-l)/2;
            if(ispossible(bloom,m,k,mi)){
                ans=mi;
                h=mi-1;
            }
            else{
                l=mi+1;
            }
        }
        return ans;
    }
    public static boolean ispossible(int []bloom,int m,int k,int mi){
        int boq=0;
        int c=0;
        for(int i:bloom){
            if(i<=mi){
                c++;
                if(c==k){
                    boq++;
                    c=0;
                }
            }
            else{
                c=0;
            }
        }
        return boq>=m;
    }
}