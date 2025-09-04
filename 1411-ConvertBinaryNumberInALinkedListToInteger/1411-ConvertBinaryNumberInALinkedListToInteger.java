// Last updated: 9/4/2025, 12:01:48 PM
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
class Solution {
    public int getDecimalValue(ListNode head) {
        String s="";
        while(head!=null){
            s+=head.val;
            head=head.next;
        }
        int ans=Integer.parseInt(s,2);
        return ans;
    }
}