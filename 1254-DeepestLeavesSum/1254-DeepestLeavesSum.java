// Last updated: 9/4/2025, 12:02:03 PM
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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode>q=new LinkedList();
        int fin=0;
        q.offer(root);
        while(!q.isEmpty()){
            int s=0;
            int sz=q.size();
            for(int i=0;i<sz;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                s+=curr.val;
            }
            fin=s;
        }
        return fin;
    }
}