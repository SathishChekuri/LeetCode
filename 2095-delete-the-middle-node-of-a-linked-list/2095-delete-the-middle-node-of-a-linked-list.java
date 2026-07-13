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
        ListNode temp=head,ans=head;
         ListNode prv=head;
        while(head!=null&&head.next!=null){
            prv=temp;
            temp=temp.next;
            head=head.next.next;
        }
        prv.next=temp.next;
        return ans;
    }
}