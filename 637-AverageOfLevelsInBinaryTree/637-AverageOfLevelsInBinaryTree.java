// Last updated: 9/4/2025, 12:03:58 PM
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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<Double>l=new ArrayList<>();
        q.add(root);
        while(q.size()>0){
            double s=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                s+=curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            double avg=(s/size);
            l.add(avg);
        }
        return l;
    }
}