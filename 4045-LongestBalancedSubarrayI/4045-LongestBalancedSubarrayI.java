// Last updated: 10/23/2025, 8:44:34 PM
class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int c=0;
        int mx=0;
        for(int i=0;i<n;i++){
            HashSet<Integer>he=new HashSet<>();
            HashSet<Integer>ho=new HashSet<>();
            for(int j=i;j<n;j++){
                if(nums[j]%2==0){
                    he.add(nums[j]);
                }
                else{
                    ho.add(nums[j]);
                }
                if(he.size()==ho.size()){
                        mx=Math.max(mx,j-i+1);
                }
            }
        }
        return mx;
        
    }
}