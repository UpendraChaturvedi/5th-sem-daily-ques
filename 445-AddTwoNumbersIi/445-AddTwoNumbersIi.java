// Last updated: 9/4/2025, 12:04:58 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        int c=0;
        ListNode dummy = new ListNode(0);
        ListNode curr1=dummy;
        while(l1!=null || l2!=null || c!=0){
            int v1=l1!=null?l1.val:0;
            int v2=l2!=null?l2.val:0;
            int s=v1+v2+c;
            c=s/10;
            curr1.next=new ListNode(s%10);
            curr1=curr1.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;

        }
        return reverse(dummy.next);
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode front=head.next;
            head.next=prev;
            prev=head;
            head=front;

        }
        return prev;
    }
}