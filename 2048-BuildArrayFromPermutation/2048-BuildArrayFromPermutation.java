// Last updated: 9/4/2025, 12:00:39 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int arr[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[nums[i]];

        }
        return arr;
        
    }
}