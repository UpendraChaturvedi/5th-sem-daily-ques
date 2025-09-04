// Last updated: 9/4/2025, 12:02:27 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n=0;
        List<Boolean>a=new ArrayList<>();
        for(int b:nums){
            n=(n*2+b)%5;
            a.add(n==0);
        }
        return a;
        
    }
}