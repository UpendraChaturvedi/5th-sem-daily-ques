// Last updated: 9/4/2025, 12:06:06 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        boolean exp=exitsl(root.left,p);
        boolean exq=exitsl(root.left,q);
        if(exp==true && exq==true) return lowestCommonAncestor(root.left,p,q);
        if(exp==false && exq==false) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
    public static boolean exitsl(TreeNode root, TreeNode node){
        if(root==node)return true;
        if(root==null) return false;
        return exitsl(root.left,node)||exitsl(root.right,node);
    }
}