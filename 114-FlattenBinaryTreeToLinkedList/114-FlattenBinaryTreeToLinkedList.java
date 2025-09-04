// Last updated: 9/4/2025, 12:07:12 PM
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
    public void flatten(TreeNode root) {
        if (root == null) return;
        ArrayList<Integer>a=new ArrayList<>();
        gen(a,root);
        TreeNode temp=root;
        temp.left=null;
        for (int i = 1; i < a.size(); i++) {
            temp.right = new TreeNode(a.get(i)); 
            temp = temp.right;
        }   
    }
    public static void gen(ArrayList<Integer>a,TreeNode root){
        if(root==null){
            return ;
        }
        a.add(root.val);
        gen(a,root.left);
        gen(a,root.right);
    }
}