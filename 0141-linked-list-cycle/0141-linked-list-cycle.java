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
       // if(head==null||head.next==null||head.next.next==null) return false;
        ListNode tort=head;
        ListNode rabit=head;
        while(rabit!=null&&rabit.next!=null){
            tort=tort.next;
            rabit=rabit.next.next;
            if(tort==rabit) return true;
        }
        return false;
    }
}