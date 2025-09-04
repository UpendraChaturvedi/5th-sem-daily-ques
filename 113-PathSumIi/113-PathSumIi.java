// Last updated: 9/4/2025, 12:07:14 PM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>a=new ArrayList<>();
        gen(root,targetSum,ans,a);
        return ans;
        
        
    }
    public static void gen(TreeNode root,int tar,List<List<Integer>>ans,List<Integer>a){
        if(root==null){
            return ;
        }
        a.add(root.val);
        if(tar==root.val && root.left==null && root.right==null){
            ans.add(new ArrayList<>(a));
        }
        
        gen(root.left,tar-root.val,ans,a);
        gen(root.right,tar-root.val,ans,a);
        a.remove(a.size()-1);
    }
}