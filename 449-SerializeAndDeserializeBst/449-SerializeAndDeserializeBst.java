// Last updated: 9/4/2025, 12:04:54 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        build(root,sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String []ans=data.split(",");
        return parse(ans);
        
    }
    public void build(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("null,");
            return;
        }
        sb.append(root.val+",");
        build(root.left,sb);
        build(root.right,sb);
    }
    int idx=0;
    public TreeNode parse(String ans[]){
        if(idx>=ans.length){
            return null;
        }
        String s=ans[idx++];
        if(s.equals("null")){
            return null;
        }
        TreeNode root1=new TreeNode(Integer.parseInt(s));
        root1.left=parse(ans);
        root1.right=parse(ans);
        return root1;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;