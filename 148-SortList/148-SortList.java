// Last updated: 9/4/2025, 12:06:51 PM
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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            a.add(curr.val);
            curr = curr.next;
        }
         Collections.sort(a);
        ListNode dummy = new ListNode(0); // Dummy node to simplify list construction
        ListNode d = dummy;
        //  ListNode d=null;
         for (int i = 0; i < a.size(); i++) {
            d.next = new ListNode(a.get(i)); 
            d=d.next;
        }
        return dummy.next;
        
    }
}