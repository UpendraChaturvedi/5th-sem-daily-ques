// Last updated: 9/4/2025, 12:03:59 PM
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int maxso = arrays.get(0).get(arrays.get(0).size() - 1);
        int minso = arrays.get(0).get(0);
        int diff = 0;
        int n=arrays.size();
        for(int i=1;i<n;i++){
            List<Integer>p=arrays.get(i);
            int min=p.get(0);
            int max=p.get(p.size()-1);
            int possibleDiff1 = Math.abs(max - minso);
            int possibleDiff2 = Math.abs(maxso - min);
            diff = Math.max(diff, Math.max(possibleDiff1, possibleDiff2));
            if(max>maxso){
                maxso=max;
                
            }
            if(min<minso){
                minso=min;
                
            }
        }
        return diff;
    }
}