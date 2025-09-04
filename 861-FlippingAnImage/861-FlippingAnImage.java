// Last updated: 9/4/2025, 12:03:08 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] img) {
        for(int i=0;i<img.length;i++){
            reverse(img[i]);
        }
        for(int i=0;i<img.length;i++){
            comp(img[i]);
        }
        return img;
        
    }
    public static void reverse(int []arr){
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int t=arr[l];
            arr[l]=arr[h];
            arr[h]=t;
            l++;
            h--;
        }
    }
    public static void comp (int []arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]^1;
        }
    }
}