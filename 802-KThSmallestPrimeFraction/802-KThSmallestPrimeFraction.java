// Last updated: 9/4/2025, 12:03:18 PM
class Pair{
    int key1;
    int key2;
    double fraction;
    Pair (int key1,int key2){
        this.key1=key1;
        this.key2=key2;
        this.fraction = (double) key1 / key2;
    }
}
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        ArrayList<Pair>a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0 && j>i;j--){
                a.add(new Pair (arr[i],arr[j]));
            }
        }
        Collections.sort(a,Comparator.comparingDouble(c->c.fraction));
        int arr1[]=new int [2];
        arr1[0]=a.get(k-1).key1;
        arr1[1]=a.get(k-1).key2;
        return arr1;
        
    }
}