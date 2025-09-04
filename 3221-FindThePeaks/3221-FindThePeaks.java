// Last updated: 9/4/2025, 11:59:09 AM
class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer>c=new ArrayList<>();
        int n=mountain.length;
        for(int i=1;i<n-1;i++){
            if(mountain[i-1]<mountain[i]&&mountain[i]>mountain[i+1]){
                c.add(i);
            }
        }
        
        return c;
        
    }
}