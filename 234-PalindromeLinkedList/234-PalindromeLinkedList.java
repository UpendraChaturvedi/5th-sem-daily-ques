// Last updated: 9/4/2025, 12:06:07 PM
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
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head;
        Stack<Integer>s=new Stack<>();
        while(curr!=null){
            s.add(curr.val);
            curr=curr.next;
        }
        curr=head;
        while(!s.isEmpty()){
            if(curr.val!=s.pop()){
                return false;
            }
            curr=curr.next;
        }
        return true;
        
    }
}