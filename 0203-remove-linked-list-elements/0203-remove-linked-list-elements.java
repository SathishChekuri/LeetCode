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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev=null,temp=head;
        while(temp!=null){
            if(temp.val!=val){
                if(prev==null){
                    head=temp;
                    prev=temp;
                }
                else prev.next=temp;
                prev=temp;
            }
           
            temp=temp.next;
        }
        if(prev!=null) prev.next=null;
        if(prev==null) return prev;
        return head;
    }
}