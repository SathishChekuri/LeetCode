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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz=0;
        ListNode head1=head;
        while(head1!=null){
            head1=head1.next;
            sz++;
        }//3...1
        if(sz==1) return null;
        n=sz-n;
        ListNode p=null;
        head1=head;
        if(n==0) return head.next;
        while(n-->0){
            p=head1;
            head1=head1.next;
        }
        if(p!=null&&head1!=null) p.next=head1.next;
        return head;
    }
}