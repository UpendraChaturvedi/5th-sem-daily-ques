// Last updated: 9/4/2025, 12:05:30 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList <Integer>a=new ArrayList<>();
        HashSet<Integer>s=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            s.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(s.contains(nums1[i])&&!a.contains(nums1[i])){
                a.add(nums1[i]);
            }
        }
        int b=a.size();
        int d[]=new int [b];
        for(int i=0;i<b;i++){
            d[i]=a.get(i);
        }
        
        return d;
    }
}