// Last updated: 9/4/2025, 12:02:32 PM
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
    public TreeNode bstFromPreorder(int[] pre) {
        TreeNode root=new TreeNode(pre[0]);
        for(int i=1;i<pre.length;i++) insert(root,pre[i]);
        return root;
    }
    public static TreeNode insert(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
}