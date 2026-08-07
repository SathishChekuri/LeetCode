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
    public ListNode detectCycle(ListNode head) {
        ListNode sl=head,fs=head;
        while(fs!=null&&fs.next!=null){
            fs=fs.next.next;
            sl=sl.next;
            if(fs==sl) break;
        }
        if(fs==null||fs.next==null) return null;
        sl=head;
        while(sl!=fs){
            fs=fs.next;
            sl=sl.next;
        }
        return sl;
    }
}