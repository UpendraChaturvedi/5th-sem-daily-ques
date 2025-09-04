// Last updated: 9/4/2025, 12:03:23 PM
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
    public TreeNode searchBST(TreeNode root, int val) {
        // Array
        if(root==null) return null;
        if(root.val<val) return searchBST(root.right,val);
        else if(root.val>val) return searchBST(root.left,val);
        else return root;
        
    }
}