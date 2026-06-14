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
    public int pairSum(ListNode head) {
       ListNode sl=head;
       ListNode fst=head;
       while(fst!=null&&fst.next!=null){
        fst=fst.next.next;
        sl=sl.next;
        }
        ListNode prev=null;
        while(sl!=null){
            ListNode Next=sl.next;
            sl.next=prev;
            prev=sl;
            sl=Next;
        }
        sl=prev;
        fst=head;
        int mx=0;
        while(fst!=null&&sl!=null){
            mx=Math.max(mx,fst.val+sl.val);
            fst=fst.next;
            sl=sl.next;
        }
        return mx;
    }
}