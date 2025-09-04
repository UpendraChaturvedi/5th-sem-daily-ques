// Last updated: 9/4/2025, 12:05:47 PM
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
        if(data==null || data.isEmpty()){
            return null;
        }
        String arr[]=data.split(",");

        return parse(arr);
        
    }
    public static void build(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("null,");
            return ;
        }
        sb.append(root.val).append(",");
        build(root.left,sb);
        build(root.right,sb);
    }
    int idx=0;
    public TreeNode parse(String []arr){
        if(idx>=arr.length){
            return null;
        }
        String s=arr[idx++];
        if(s.equals("null")){
            return null;
        }
        TreeNode root1=new TreeNode(Integer.parseInt(s));
        root1.left=parse(arr);
        root1.right=parse(arr);
        return root1;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));