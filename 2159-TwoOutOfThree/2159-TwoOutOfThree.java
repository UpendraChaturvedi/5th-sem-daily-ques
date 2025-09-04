// Last updated: 9/4/2025, 12:00:20 PM
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer>l=new HashSet<>();
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i:nums1){
            a1.add(i);
        }
        ArrayList<Integer>a2=new ArrayList<>();
        for(int i:nums2){
            a2.add(i);
        }
        ArrayList<Integer>a3=new ArrayList<>();
        for(int i:nums3){
            a3.add(i);
        }
        for(int i:nums1){
            if(a2.contains(i) || a3.contains(i)){
                l.add(i);
            }
        }
        for(int i:nums2){
            if(a1.contains(i) || a3.contains(i)){
                l.add(i);
            }
        }
        for(int i:nums3){
            if(a1.contains(i) || a2.contains(i)){
                l.add(i);
            }
        }
        ArrayList<Integer> l1 = new ArrayList<>(l);
        return l1;

    }
}