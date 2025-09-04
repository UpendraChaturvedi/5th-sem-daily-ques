// Last updated: 9/4/2025, 12:01:16 PM
class Solution {
    public int maxDistance(int[] pos, int m) {
        Arrays.sort(pos);
        int l=0;
        int h=pos[pos.length-1]-pos[0];
        int ans=-1;
        while(l<=h){
            int mi=l+(h-l)/2;
            if(ispossi(pos,m,mi)){
                ans=mi;
                l=mi+1;
            }
            else{
                h=mi-1;
            }
        }
        return ans;
    }
    public static boolean ispossi(int []pos,int m,int mid){
        int c=1;
        int laspos=pos[0];
        for(int i=1;i<pos.length;i++){
            if(pos[i]-laspos>=mid){
                c++;
                laspos=pos[i];
            }
            if(c==m) return true;
        }
        return false;
    }
}