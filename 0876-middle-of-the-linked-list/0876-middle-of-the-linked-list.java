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
    public ListNode middleNode(ListNode head) {
        if(head==null) return head;
        ListNode sl=head,fs=head.next;
        while(fs!=null){
            if(fs.next==null) return sl.next;
            sl=sl.next;
            fs=fs.next.next;
        }
        return sl;
    }
}