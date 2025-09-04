// Last updated: 9/4/2025, 12:07:03 PM
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
    public int sumNumbers(TreeNode root) {
        return gen(root,0);
        
    }
    public static int gen(TreeNode root,int s){
        if(root==null){
            return 0;
        }
        s=s*10+root.val;
        if(root.left== null && root.right==null){
            return s;
        }
        return gen(root.left,s)+gen(root.right,s);
       
    }
}