// Last updated: 9/4/2025, 12:07:28 PM
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
    public boolean isValidBST(TreeNode root) {
        long l = Long.MIN_VALUE;
        long h = Long.MAX_VALUE;
        return isb(root, l, h);
    }

    public static boolean isb(TreeNode root, long l, long h) {
        if (root == null) {
            return true;
        }
        if (root.val <= l || root.val >= h) {
            return false;
        }
        return isb(root.left, l, root.val) && isb(root.right, root.val, h);
    }
}
