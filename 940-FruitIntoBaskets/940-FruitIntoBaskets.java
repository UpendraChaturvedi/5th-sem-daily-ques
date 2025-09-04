// Last updated: 9/4/2025, 12:02:55 PM
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>h=new HashMap<>();
        int i=0;
        int j=0;
        int len=0;
        int n=fruits.length;
        while(j<n){
            h.put(fruits[j],h.getOrDefault(fruits[j],0)+1);
            while(h.size()>2){
                h.put(fruits[i],h.get(fruits[i])-1);
                if(h.get(fruits[i])==0) h.remove(fruits[i]);
                i++;
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}