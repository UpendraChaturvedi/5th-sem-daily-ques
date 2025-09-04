// Last updated: 9/4/2025, 11:58:28 AM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int unp=0;
        boolean used[]=new boolean [n];
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(!used[j] && baskets[j]>=fruits[i]){
                    used[j]=true;
                    found=true;
                    break;
                }
            }
            if(!found){
                unp++;
            }
        }
        return unp;
    }
}