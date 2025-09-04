// Last updated: 9/4/2025, 12:06:24 PM
class Solution {
    public int countPrimes(int n) {
        int arr[]=new int [n];
        if(arr.length<2) return 0;
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<n;i++){
            for(int j=i*2;j<n;j+=i){
                arr[j]=1;
            }
        }
        int c=0;
        for(int i:arr){
            if(i==0) c++;
        }
        return c;
    }
}