// Last updated: 9/4/2025, 12:03:53 PM
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n=nums.length;
        return gen(nums,0,n-1);
    }
    public static TreeNode gen(int []nums,int st,int en){
        if(st>en) return null;
        int max=getmax(nums,st,en);
        TreeNode root=new TreeNode(nums[max]);
        root.left=gen(nums,st,max-1);
        root.right=gen(nums,max+1,en);
        return root;
    }
    public static int getmax(int []nums,int st,int en){
        int ind=-1;
        int max=-1;
        for(int i=st;i<=en;i++){
            if(nums[i]>max){
                max=nums[i];
                ind=i;
            }
        }
        return ind;
    }
}