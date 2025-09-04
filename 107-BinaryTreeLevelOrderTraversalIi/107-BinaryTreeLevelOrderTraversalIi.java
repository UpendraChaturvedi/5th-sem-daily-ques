// Last updated: 9/4/2025, 12:07:21 PM
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>l=new ArrayList<>();
        List<List<Integer>>l2=new ArrayList<>();
        if(root==null){
            return l;
        }
        gen(root,l);
        for(int i=l.size()-1;i>=0;i--){
            l2.add(l.get(i));
        }
        return l2;
    }
    public static void gen(TreeNode root,List<List<Integer>>l){
        
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer>l1=new ArrayList<>();
            int sz=q.size();
            for(int i=0;i<sz;i++){
                TreeNode curr=q.poll();
                l1.add(curr.val);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            l.add(l1);
        }
    }
}