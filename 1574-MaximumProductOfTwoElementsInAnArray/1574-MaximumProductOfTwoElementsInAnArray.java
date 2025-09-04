// Last updated: 9/4/2025, 12:01:30 PM
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                pq.add((nums[i]-1)*(nums[j]-1));
            }
        }
        return pq.peek();
    }
}