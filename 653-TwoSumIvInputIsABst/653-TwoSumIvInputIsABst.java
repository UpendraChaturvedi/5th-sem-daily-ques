// Last updated: 9/4/2025, 12:03:54 PM
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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer>a=new ArrayList<>();
        gen(a,root);
        int l=0;
        int h=a.size()-1;
        while(l<h){
            int s=a.get(l)+a.get(h);
            if(s==k) return true;
            if(s<k) l++;
            else h--;
        }
        return false;
        
    }
    public static void gen(ArrayList<Integer>a,TreeNode root){
        if(root==null){
            return ;
        }
        gen(a, root.left);   
        a.add(root.val);     
        gen(a, root.right);
    }
}