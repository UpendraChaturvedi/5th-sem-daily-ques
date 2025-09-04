// Last updated: 9/4/2025, 12:07:23 PM
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
    public int maxDepth(TreeNode root) {
        return heigh(root);
    }
    public static int heigh(TreeNode root){
        if(root==null) return 0;
        int left=heigh(root.left);
        int right=heigh(root.right);
        return Math.max(left,right)+1;
    }
}