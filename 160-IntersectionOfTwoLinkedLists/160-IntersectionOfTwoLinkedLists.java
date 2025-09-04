// Last updated: 9/4/2025, 12:06:44 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int c1 = 0, c2 = 0;

        while (a != null) {
            a = a.next;
            c1++;
        }

        while (b != null) {
            b = b.next;
            c2++;
        }

        a = headA;
        b = headB;

        if (c2 > c1) {
            for (int i = 0; i < c2 - c1; i++) {
                b = b.next;
            }
        } else {
            for (int i = 0; i < c1 - c2; i++) {
                a = a.next;
            }
        }

        while (a != null && b != null) {
            if (a == b) return a;
            a = a.next;
            b = b.next;
        }

        return null;
        
    }
}