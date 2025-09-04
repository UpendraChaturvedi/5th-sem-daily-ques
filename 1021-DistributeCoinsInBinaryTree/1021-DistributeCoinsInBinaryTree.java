// Last updated: 9/4/2025, 12:02:38 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {c
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=0;
    public int distributeCoins(TreeNode root) {
        distri(root);
        return ans;
    }
    public int distri(TreeNode root) {
        if(root==null) return 0;
        int left=distri(root.left);
        int right=distri(root.right);
        ans=ans+Math.abs(left)+Math.abs(right);
        return root.val+left+right-1;
        
    }
}