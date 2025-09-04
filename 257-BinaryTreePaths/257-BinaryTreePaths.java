// Last updated: 9/4/2025, 12:06:00 PM
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>l=new ArrayList<>();
        path(l,root,"");
        return l;
    }
    public static void path(List<String>l,TreeNode root,String ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans+=root.val;
            l.add(ans);
            return ;
        } 
        if(root.left!=null){
            path(l,root.left,ans+root.val+"->");
        }
        if(root.right!=null){
            path(l,root.right,ans+root.val+"->");
        }
    }
}