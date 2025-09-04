// Last updated: 9/4/2025, 12:04:45 PM
class Solution {
    public int findRadius(int[] hou, int[] heat) {
        int l=0;
        Arrays.sort(hou);
        Arrays.sort(heat);
        int h = Math.max(hou[hou.length - 1], heat[heat.length - 1]) - Math.min(hou[0], heat[0]);
        // for(int i:hou){
        //     h+=i;
        // }
        int ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(isposs(hou,heat,m)){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    // public static boolean isposs(int []hou,int []heat,int m){
    //     int n=hou.length;
    //     boolean []used=new boolean [n];
    //     for(int i:heat){
    //         int min=i-m;
    //         int max=i+m;
    //         for(int j=0;j<hou.length;j++){
    //             int ele=hou[j];
    //             if(ele>=min && ele<=max){
    //                 used[j]=true;
    //             }
    //         }
    //     }
    //     for(int i=0;i<used.length;i++){
    //         if(used[i]==false) return false;
    //     }
    //     return true;
    // }
    public static boolean isposs(int[] houses, int[] heaters, int radius) {
        int i = 0, j = 0;
        int n = houses.length, m = heaters.length;
        while (i < n && j < m) {
            int minCover = heaters[j] - radius;
            int maxCover = heaters[j] + radius;
            while (i < n && houses[i] >= minCover && houses[i] <= maxCover) {
                i++;
            }
            j++;
        }

        return i == n;
    }
}