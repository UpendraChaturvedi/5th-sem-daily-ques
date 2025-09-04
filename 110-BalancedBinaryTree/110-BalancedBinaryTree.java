// Last updated: 9/4/2025, 12:07:17 PM
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
    public boolean isBalanced(TreeNode root) {
        return isbal(root)==-1?false:true;
    }
    public static int isbal(TreeNode root){
        if(root==null) return 0;
        int l=isbal(root.left);
        int ri=isbal(root.right);
        if(l==-1 || ri==-1 || Math.abs(l-ri)>1) return -1;
        return Math.max(l,ri)+1;
    }
}