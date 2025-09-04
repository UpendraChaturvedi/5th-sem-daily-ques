// Last updated: 9/4/2025, 11:58:50 AM
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer> a = new HashSet<>();
        for (int i : nums) {
            a.add(i);
        }
        ListNode curr=head;
        ArrayList<Integer>b=new ArrayList<>();
        while(curr!=null){
            if(a.contains(curr.val)){
                curr=curr.next;
            }
            else{
                b.add(curr.val);
                curr=curr.next;
            }
        }
        ListNode d=new ListNode(-1);
        curr=d;
        for(int i:b){
            curr.next=new ListNode(i);
            curr=curr.next;
        }
        return d.next;
        
    }
}