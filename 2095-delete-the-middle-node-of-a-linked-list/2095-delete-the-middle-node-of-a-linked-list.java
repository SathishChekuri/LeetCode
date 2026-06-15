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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode fs=head;
        ListNode sl=head;
        ListNode prev=sl;
        while(fs!=null&&fs.next!=null){
            prev=sl;
            sl=sl.next;
            fs=fs.next.next;
        }
        prev.next=sl.next;
        return head;
    }
}