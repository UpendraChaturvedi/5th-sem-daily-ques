// Last updated: 9/4/2025, 12:07:44 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>sub=new ArrayList<>();
        subset(nums,l,sub,0);
        return l;
        
    }
    public static void subset(int []nums,List<List<Integer>>l,List<Integer>sub,int ind){
        if(ind==nums.length){
            l.add(new ArrayList<>(sub));
            return ;
        }
        sub.add(nums[ind]);
        subset(nums,l,sub,ind+1);
        sub.remove(sub.size()-1);
        subset(nums,l,sub,ind+1);
    }
}