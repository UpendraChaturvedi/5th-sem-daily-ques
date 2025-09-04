// Last updated: 9/4/2025, 12:07:38 PM
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
    public ListNode partition(ListNode head, int x) {
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);
        ListNode curr1=d1;
        ListNode curr=head;
        ListNode curr2=d2;
        while(curr!=null){
            if(curr.val<x){
                curr1.next=curr;
                curr1=curr;
            }
            else{
                curr2.next=curr;
                curr2=curr;
            }
            curr=curr.next;
        }
        curr2.next=null;
        curr1.next=d2.next;
        return d1.next;

    }
}