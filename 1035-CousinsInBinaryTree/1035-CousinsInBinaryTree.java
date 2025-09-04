// Last updated: 9/4/2025, 12:02:36 PM
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
    static TreeNode parentx=null;
    static TreeNode parenty=null;
    static int depthx=-1;
    static int depthy=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
        parentx = null;
        parenty = null;
        depthx = -1;
        depthy = -1;
        if(root==null) return false;
        gen(root,null,x,y,0);
        return (parentx!=parenty && depthx==depthy);
        
    }
    public static void gen(TreeNode root,TreeNode parent,int x,int y,int l){
        if(root==null) return ;
        if(root.val==x){
            parentx=parent;
            depthx=l;
        }
        if(root.val==y){
            parenty=parent;
            depthy=l;
        }
        if (parentx != null && parenty != null) return;
        gen(root.left,root,x,y,l+1);
        gen(root.right,root,x,y,l+1);
    }
}