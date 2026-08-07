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
    public boolean isPalindrome(ListNode head) {
        ListNode head2=new ListNode(head.val),prev=null,temp=head;
        ListNode head1=head2;
        while(temp.next!=null){
            temp=temp.next;
            head2.next=new ListNode(temp.val);
            head2=head2.next;
        }
        // while(head1!=null){
        //     System.out.print(head1.val);
        //     head1=head1.next;
        // }
        while(head!=null){
            ListNode t=head.next;
            head.next=prev;
            prev=head;
            head=t;
        }
        while(prev!=null&&head1!=null){
            if(prev.val!=head1.val) return false;
            head1=head1.next;
            prev=prev.next;
        }
        return true;
    }
}