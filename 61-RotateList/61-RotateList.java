// Last updated: 9/4/2025, 12:07:59 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int len=1;
        ListNode t=head;
        while(t.next!=null){
            t=t.next;
            len++;
        }
        if(k%len==0){
            return head;
        }
        t.next=head;
        // ListNode curr=head;
        k=k%len;
        k=len-k;
        while(k-->0){
            t=t.next;
        }
        head=t.next;
        t.next=null;
        return head;
        

        
    }
}