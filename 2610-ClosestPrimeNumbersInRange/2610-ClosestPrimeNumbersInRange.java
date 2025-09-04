// Last updated: 9/4/2025, 11:59:39 AM
class Solution {
    public int[] closestPrimes(int left, int right) {
            ArrayList<Integer>a=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(prime(i)){
                a.add(i);
            }
        }
        if (a.size() < 2) return new int[]{-1, -1};
        int min=Integer.MAX_VALUE;
        int i1=-1;
        int i2=-1;
        for(int i=1;i<a.size();i++){
            int m=a.get(i)-a.get(i-1);
            if(m<min){
                min=m;
                i1=a.get(i-1);                
                i2=a.get(i);

            }
            
        }
        return new int []{i1,i2};
        
    }
    public static boolean prime(int n){
        if (n < 2) return false;
        if (n == 2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}