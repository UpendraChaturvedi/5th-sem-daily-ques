// Last updated: 9/4/2025, 12:04:01 PM
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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        dfs(root,val,1,depth);
        return root;
    }
    public static void dfs(TreeNode root,int val,int h,int d){
        if(root==null) return ;
        if(h==d-1){
            TreeNode l=root.left;
            TreeNode r=root.right;
            root.left=new TreeNode(val);
            root.left.left=l;
            
            root.right=new TreeNode(val);
            root.right.right=r;


        }
        dfs(root.left,val,h+1,d);
        dfs(root.right,val,h+1,d);
    }
}