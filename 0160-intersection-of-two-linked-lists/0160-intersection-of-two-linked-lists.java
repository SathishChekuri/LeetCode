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
        HashSet<ListNode> hs=new HashSet<>();
        ListNode TA=headA,TB=headB;
        while(TA!=TB){
           if(TA==null) TA=headB;
           else TA=TA.next;
           if(TB==null) TB=headA;
           else TB=TB.next;
        }
        return TA;
    }
}