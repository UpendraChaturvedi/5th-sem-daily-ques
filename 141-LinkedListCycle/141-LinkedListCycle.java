// Last updated: 9/4/2025, 12:06:56 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode>s=new HashSet<>();
        for(ListNode curr=head;curr!=null;curr=curr.next){
            if(s.contains(curr)){
                return true;
            }
            s.add(curr);
            
        }
        return false;
        
    }
}