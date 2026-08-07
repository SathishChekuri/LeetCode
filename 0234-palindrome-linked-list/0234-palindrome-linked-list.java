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
        if(head==null||head.next==null)
            return true;
        ListNode sl=head,fs=head;
        while(fs!=null&&fs.next!=null){
            sl=sl.next;
            fs=fs.next.next;
        }
        ListNode head1=reverse(sl);
        
        while(head1!=null){
            if(head1.val!=head.val) return false;
            head1=head1.next;
            head=head.next;
        }
        return true;
    }
    ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode t=head.next;
            head.next=prev;
            prev=head;
            head=t;
        }
        return prev;
    }
}