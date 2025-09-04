// Last updated: 9/4/2025, 11:59:00 AM
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] ans = new int[queries.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                list.add(i);
            }
        }
        for(int i=0;i<queries.length;i++){
            if(queries[i]>list.size()){
                ans[i]=-1;
            }else{
                ans[i]=list.get(queries[i]-1);
            }
        }
        return ans;
    }
}