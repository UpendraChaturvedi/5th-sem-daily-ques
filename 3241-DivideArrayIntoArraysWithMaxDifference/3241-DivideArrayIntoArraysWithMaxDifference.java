// Last updated: 9/4/2025, 11:59:07 AM
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        List<List<Integer>>l=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i+=3){
            if(nums[i+2]-nums[i]<=k){
                l.add(Arrays.asList(nums[i],nums[i+1],nums[i+2]));
            }
            else{
                return new int[0][0];
            }
        }
        int[][] res = new int[l.size()][3];
        for (int i = 0; i < l.size(); i++) {
            List<Integer> group = l.get(i);
            for (int j = 0; j < 3; j++) {
                res[i][j] = group.get(j);
            }
        }
        return res;
    }
}