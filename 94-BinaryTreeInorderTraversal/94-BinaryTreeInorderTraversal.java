// Last updated: 9/4/2025, 12:07:30 PM
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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>a=new ArrayList<>();
        inorder(root,a);
        return a;
        
    }
    public static void inorder(TreeNode root,List<Integer>a){
        if(root!=null){
            inorder(root.left,a);
            a.add(root.val);
            inorder(root.right,a);
        }
    }
}
