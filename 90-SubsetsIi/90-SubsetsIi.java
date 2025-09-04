// Last updated: 9/4/2025, 12:07:34 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums, 0, new ArrayList<>(), mainList);
        return mainList;
    }

    private void subset(int[] nums, int start, List<Integer> list, List<List<Integer>> mainList) {
        mainList.add(new ArrayList<>(list));
        
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            
            list.add(nums[i]);
            subset(nums, i + 1, list, mainList);
            list.remove(list.size() - 1);
        }
    }
}