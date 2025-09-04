// Last updated: 9/4/2025, 12:02:49 PM
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return gen(root,low,high);
    }
    public static int gen(TreeNode root,int low,int high){
        int s=0;
        if(root==null ) return 0;
        if(root.val<=high && root.val>=low){
            s+=root.val;
        }
        s+=gen(root.left,low,high);
        s+=gen(root.right,low,high);
        return s;
    }
}