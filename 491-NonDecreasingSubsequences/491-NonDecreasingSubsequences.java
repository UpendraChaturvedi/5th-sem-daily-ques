// Last updated: 9/4/2025, 12:04:41 PM
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer>l=new ArrayList<>();
        gen(nums,0,ans,l);
        return new ArrayList<>(ans);
    }
    public static void gen(int []nums,int idx,Set<List<Integer>> ans,List<Integer>l){
        if(l.size()>=2){
            ans.add(new ArrayList<>(l));
            // return;
        }

        HashSet<Integer>h=new HashSet<>();
        for(int i=idx;i<nums.length;i++){
            if(h.contains(nums[i])) continue;
            if(l.isEmpty()||nums[i]>=l.get(l.size()-1)){
               l.add(nums[i]);
               gen(nums,i+1,ans,l);
               l.remove(l.size() - 1);
            }
        }
    }
}