// Last updated: 9/4/2025, 12:04:20 PM
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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ld=diameterOfBinaryTree(root.left);
        int rd=diameterOfBinaryTree(root.right);
        int sd=h(root.left)+h(root.right)+2;
        return Math.max(sd,Math.max(rd,ld));
        
    }
    public static int h(TreeNode root){
        if(root==null){
            return -1;
        }
        return Math.max(h(root.left),h(root.right))+1;
    }
}