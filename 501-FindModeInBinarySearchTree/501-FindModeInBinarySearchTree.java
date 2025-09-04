// Last updated: 9/4/2025, 12:04:37 PM
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
    public int[] findMode(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>h=new HashMap<>();
        gen(root,h);
        int maxfreq=0;
        for(Map.Entry<Integer,Integer>e:h.entrySet()){
            int freq=e.getValue();
            int key=e.getKey();
            if(freq>maxfreq){
                maxfreq=freq;
                l.clear();
                l.add(key);
            }
            else if(freq==maxfreq){
                l.add(key);
            }
        }
        int ans[]=new int [l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;



    }
    public static void gen(TreeNode root,HashMap<Integer,Integer>h){
        if(root==null) return ;
        gen(root.left,h);
        h.put(root.val,h.getOrDefault(root.val,0)+1);
        gen(root.right,h);

    }
}