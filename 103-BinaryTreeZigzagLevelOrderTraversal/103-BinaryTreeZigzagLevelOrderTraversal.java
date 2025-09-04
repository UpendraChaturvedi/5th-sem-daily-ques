// Last updated: 9/4/2025, 12:07:24 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>l=new ArrayList<>();
        if(root==null) return l;
        bfs(root,l);
        return l;
    }
    public static void bfs(TreeNode root,List<List<Integer>>l){
        Queue<TreeNode>q=new LinkedList<>();
        int lev=0;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer>l1=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(lev%2!=0){
                    l1.addFirst(curr.val);
                }
                else{
                    l1.add(curr.val);
                }
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);

            }
            l.add(l1);
            lev++;
        }
    }
}