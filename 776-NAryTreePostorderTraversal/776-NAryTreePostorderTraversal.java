// Last updated: 9/4/2025, 12:03:26 PM
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer>l=new ArrayList<>();
        gen(root,l);
        return l;
    }
    public static void gen(Node root,ArrayList<Integer>l){
        if(root==null) return ;
        for (Node child : root.children) {
            gen(child, l);  
        }
        l.add(root.val);
        
    }
}