// Last updated: 9/4/2025, 12:07:18 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer>l=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            l.add(curr.val);
            curr=curr.next;
        }
        int n=l.size();
        return gen(l,0,n-1);
        
    }
    public static TreeNode gen(ArrayList<Integer>l,int lo,int hi){
       if(lo>hi){
        return null;
       }
       int m=lo+(hi-lo)/2;
       TreeNode root=new TreeNode(l.get(m));
       root.left=gen(l,lo,m-1);
       root.right=gen(l,m+1,hi);
       return root;
    }
}