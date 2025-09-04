// Last updated: 9/4/2025, 12:01:46 PM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>l=new ArrayList<>();
        merge(root1,l);
        merge(root2,l);
        Collections.sort(l);
        return l;
    }
    public static void merge(TreeNode root,List<Integer>l){
        if(root==null) return ;
        l.add(root.val);
        merge(root.left,l);
        merge(root.right,l);
    }
}