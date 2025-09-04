// Last updated: 9/4/2025, 12:04:32 PM
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>l=new ArrayList<Integer>();
        if(root==null) return l;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int c=q.size();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<c;i++){
                TreeNode curr=q.poll();
                max=Math.max(max,curr.val);
                
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            l.add(max);
        }
       
        return l;
        
    }
}