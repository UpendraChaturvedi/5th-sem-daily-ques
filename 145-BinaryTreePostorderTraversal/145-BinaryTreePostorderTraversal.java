// Last updated: 9/4/2025, 12:06:52 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        postorderHelper(root, l);
        return l;
    }

    private void postorderHelper(TreeNode root, List<Integer> l) {
        if (root != null) {
            postorderHelper(root.left, l);
            postorderHelper(root.right, l);
            l.add(root.val);
        }
    }
        
    
}