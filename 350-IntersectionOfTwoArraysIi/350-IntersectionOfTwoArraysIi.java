// Last updated: 9/4/2025, 12:05:29 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        ArrayList<Integer>c=new ArrayList<>();
        
        for(int i:nums1){
            a.add(i);
        }
        for(int i:nums2){
            b.add(i);
        }
        for (int i = 0; i < a.size(); i++){
            if(b.contains(a.get(i))){
                c.add(a.get(i));
                b.remove((Integer) a.get(i));
            }
        }
        int t[]=new int [c.size()];
        for (int i = 0; i < c.size(); i++){
            t[i]=c.get(i);
        }
        return t;
        
    }
}