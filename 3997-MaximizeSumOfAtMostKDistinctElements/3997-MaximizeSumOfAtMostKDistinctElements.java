// Last updated: 10/23/2025, 8:44:49 PM
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer>a=new ArrayList<>();
        for(int i=n-1;i>=0 && a.size()<k;i--){
            if(!a.contains(nums[i])){
                a.add(nums[i]);
            }
        }
        int an[]=new int [a.size()];
        for(int i=0;i<a.size();i++){
            an[i]=a.get(i);
        }
        return an;
    }
}