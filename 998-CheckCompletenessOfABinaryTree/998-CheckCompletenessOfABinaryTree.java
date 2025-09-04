// Last updated: 9/4/2025, 12:02:45 PM
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
    int count = 0, maxIndex = 0;
    public boolean isCompleteTree(TreeNode root) {
        dfs(root, 1);
        return count == maxIndex;
    }

    void dfs(TreeNode node, int index) {
        if (node == null) return;
        count++;
        maxIndex = Math.max(maxIndex, index);
        dfs(node.left, index * 2);
        dfs(node.right, index * 2 + 1);
    }
}