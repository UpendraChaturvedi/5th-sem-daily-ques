// Last updated: 9/4/2025, 12:02:26 PM
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
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr=head;;
        int n=0;
        while(curr!=null){
            curr=curr.next;
            n++;
        }
        ArrayList<Integer>a=new ArrayList<>();
        curr=head;
        
        while(curr!=null){
            ListNode gr=curr.next;
            boolean f=false;
            while(gr!=null){
                if(gr.val>curr.val){
                    a.add(gr.val);
                    f=true;
                    break;
                }
                gr=gr.next;
            }
            if(!f){
                a.add(0);
            }
            curr=curr.next;
        }
        int b[]=new int [n];
        for(int i=0;i<a.size();i++){
            b[i]=a.get(i);
        }
        return b;
        
    }
}