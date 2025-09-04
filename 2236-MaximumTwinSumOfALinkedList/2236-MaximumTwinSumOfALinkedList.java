// Last updated: 9/4/2025, 12:00:14 PM
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
    public int pairSum(ListNode head) {
        ListNode l1=head;
        ListNode l2=mid(head).next;
        l2=rev(l2);
        int res=Integer.MIN_VALUE;
        while(l1!=null && l2!=null){
            res=Math.max(res,l1.val+l2.val);
            l1 = l1.next; 
            l2 = l2.next;
        }
        return res;
        
    }
    public static ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}