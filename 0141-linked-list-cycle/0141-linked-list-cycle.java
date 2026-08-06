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
        ListNode sl=head,fst=head;
        while(fst!=null&&fst.next!=null){
            fst=fst.next.next;
            sl=sl.next;
            if(sl==fst) return true;
        }
        return false;
    }
}