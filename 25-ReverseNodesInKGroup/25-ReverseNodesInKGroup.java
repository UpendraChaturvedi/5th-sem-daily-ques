// Last updated: 9/4/2025, 12:08:34 PM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=null;
        ListNode front=null;
        if (head == null || k == 1) {
            return head;
        }


        ListNode curr = head;
        int count = 0;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if (count < k) {
            return head;
        }
        int c=0;
        curr=head;
        while(curr!=null &&c<k){
            
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
            c++;
        }
        if (front != null) {
            head.next = reverseKGroup(front, k);
        }
        return prev;
        
    }
}