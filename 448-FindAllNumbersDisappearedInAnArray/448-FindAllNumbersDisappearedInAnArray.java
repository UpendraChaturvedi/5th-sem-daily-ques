// Last updated: 9/4/2025, 12:04:57 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>s=new HashSet<>();
        for(int val:nums){
            s.add(val);
        }
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!s.contains(i)){
                l.add(i);
            }
        }
        return l;
        
    }
}