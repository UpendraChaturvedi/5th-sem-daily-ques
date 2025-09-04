// Last updated: 9/4/2025, 12:06:30 PM
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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer>a=new ArrayList<>();
        gen(a,root,0);
        return a;
        
    }
    public static void gen(ArrayList<Integer>a,TreeNode root,int l){
        if(root==null){
            return ;
        }
        if(l==a.size()){
            a.add(root.val);
        }
        gen(a,root.right,l+1);
        gen(a,root.left,l+1);

    }
}