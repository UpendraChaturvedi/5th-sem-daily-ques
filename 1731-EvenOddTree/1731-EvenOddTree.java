// Last updated: 9/4/2025, 12:01:12 PM
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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int lev=0;
        while(!q.isEmpty()){
            int prevo=-1;
            int preve=Integer.MAX_VALUE;
            int sz=q.size();
            for(int i=0;i<sz;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                if(lev%2==0){
                    if(curr.val%2==0 || prevo>=curr.val) return false;
                    prevo=curr.val;
                }
                else{
                    if(curr.val%2!=0 || preve<=curr.val) return false;
                    preve=curr.val;
                }
            }
            lev++;
        }
        return true;
    }
}