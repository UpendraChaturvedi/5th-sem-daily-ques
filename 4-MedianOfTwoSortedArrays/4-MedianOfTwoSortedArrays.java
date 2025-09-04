// Last updated: 9/4/2025, 12:08:54 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>l=new ArrayList<>();
        for(int i:nums1){
            l.add(i);
        }
        for(int i:nums2){
            l.add(i);
        }
        Collections.sort(l);
        int n =l.size();
        if (n % 2==0) {
            return ((double)l.get(n/2 - 1) +(double)l.get(n/2) )/2.0;
        } else {
            return (double)l.get(n/2);
        }
    }
}