// Last updated: 11/19/2025, 11:02:57 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int f=original;
        while(found(nums,f)){
            f=f*2;
        }
        return f;
    }
    public static boolean found(int []nums,int f){
        for(int i:nums){
            if(i==f) return true;
        }
        return false;
    }
}