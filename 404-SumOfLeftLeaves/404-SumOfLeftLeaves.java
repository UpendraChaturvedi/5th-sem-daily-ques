// Last updated: 9/4/2025, 12:05:12 PM
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
    public int sumOfLeftLeaves(TreeNode root) {
        
        return gen(root);
    }
    public static int gen(TreeNode root){
        if(root==null) return 0;
        int s=0;
        if(isleft(root.left)) s+=root.left.val;
        s+=gen(root.left);
        s+=gen(root.right);
        return s;
    }
    public static boolean isleft(TreeNode root){
        if(root==null) return false;
        if(root.left==null && root.right==null) return true;
        else return false;
    }
}