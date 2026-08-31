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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int i=1;
        int mn=Integer.MAX_VALUE;
        ListNode prev=null;
        int l_id=-1,f_id=-1;
        while(head.next!=null){
            if(prev!=null && (((head.next.val>head.val) && (prev.val>head.val))||(head.next.val<head.val && prev.val<head.val))){
                if(l_id!=-1) mn=Math.min(mn,i-l_id);
                if(f_id==-1) f_id=i;
                l_id=i;
            }
            prev=head;
            head=head.next;
            i++;
        }
        if(mn==Integer.MAX_VALUE) return new int[]{-1,-1};
        return new int[]{mn,l_id-f_id};
    }
}