// Last updated: 9/4/2025, 12:07:19 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        return gen(nums,0,nums.length-1);
        
    }
    public TreeNode gen(int []nums,int s,int e){
        if(s>e){
            return null;
        }
        int m=(s+e)/2;
        TreeNode root=new TreeNode(nums[m]);
        root.left=gen(nums,s,m-1);
        root.right=gen(nums,m+1,e);
        return root;
    }
}