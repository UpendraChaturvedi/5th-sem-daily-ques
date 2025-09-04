// Last updated: 9/4/2025, 12:02:44 PM
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
    int camera=0;
    public int minCameraCover(TreeNode root) {
        int c=mincam(root);
        if(c==-1){
            camera++;
        }
        return camera;
    }
    public int mincam(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=mincam(root.left);
        int right=mincam(root.right);
        if(left==-1 || right==-1){ //is node par camera ki eed hai
            camera++;
            return 1; // camera setup kra is node pe
        }
        else if(left==1 || right==1){ // inmse koi ek ke paas camera hai ya dono ke paas camera hai or ek pass camera hai or 
        return 0;// iska matlab as a parent hum covered hai 

        }
        else{
            return -1; // need hai camera ki
        }
    }
}