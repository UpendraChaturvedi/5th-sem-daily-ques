// Last updated: 9/4/2025, 12:04:34 PM
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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer>h=new HashMap<>();
        ArrayList<Integer>a=new ArrayList<>();
        sum(root,h);
        int max=0;
        for(Map.Entry<Integer,Integer>e:h.entrySet()){
            int fre=e.getValue();
            int key=e.getKey();
            if(fre>max){
                max=fre;
                a.clear();
                a.add(key);
            }
            else if(fre==max){
                a.add(key);
            }
        }
        int ans[]=new int [a.size()];
        for(int i=0;i<a.size();i++){
            ans[i]=a.get(i);
        }
        return ans;
    }
    public static int sum(TreeNode root,HashMap<Integer,Integer>h){
        if(root==null) return 0;
        int l=sum(root.left,h);
        int r=sum(root.right,h);
        int s=l+r+root.val;
        h.put(s,h.getOrDefault(s,0)+1);
        return s;
    }
}