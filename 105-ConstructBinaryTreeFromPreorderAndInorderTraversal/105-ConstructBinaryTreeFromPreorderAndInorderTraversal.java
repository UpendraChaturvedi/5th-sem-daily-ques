// Last updated: 9/4/2025, 12:07:20 PM
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
    static int ind=0;
    public TreeNode buildTree(int[] pre, int[] in) {
        ind=0;
        return cons(pre,in,0,pre.length-1);
    }
    
    public static TreeNode cons(int []pre,int []in,int st,int en){
        if(st>en || ind>in.length) return null;
        int val=pre[ind++];
        TreeNode root=new TreeNode(val);
        int index=0;
        for(int i=st;i<=en;i++){
            if(in[i]==val){
                index=i;
                break;
            }
        }
        root.left=cons(pre,in,st,index-1);
        root.right=cons(pre,in,index+1,en);
        return root;
    }
}