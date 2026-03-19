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
        if(head==null||head.next==null||head.next.next==null) return false;
        ListNode tort=head;
        ListNode rabit=head.next.next;
        while(tort!=rabit){
            if(tort.next==null||rabit.next==null||rabit.next.next==null) return false;
            tort=tort.next;
            rabit=rabit.next.next;
        }
        return true;
    }
}