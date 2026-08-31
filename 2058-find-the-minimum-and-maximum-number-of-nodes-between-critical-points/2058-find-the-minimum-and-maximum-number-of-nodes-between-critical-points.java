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
        ArrayList<Integer> ar=new ArrayList<>();
        int i=1;
        int mn=Integer.MAX_VALUE;
        ListNode prev=null;
        while(head.next!=null){
            if(prev!=null && (((head.next.val>head.val) && (prev.val>head.val))||(head.next.val<head.val && prev.val<head.val))){
                 if(ar.size()>0) mn=Math.min(mn,i-ar.get(ar.size()-1));
                 ar.add(i);
            }
            prev=head;
            head=head.next;
            i++;
        }
        if(ar.size()<=1) return new int[]{-1,-1};
        return new int[]{mn,ar.get(ar.size()-1)-ar.get(0)};
    }
}