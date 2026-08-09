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
    public ListNode rotateRight(ListNode head, int k) {
        int sz=0;
        ListNode temp=head;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        if(sz<=1) return head;
        k=k%sz;
        temp=head;
        ListNode prev=null;
        while(sz!=k){
            prev=temp;
            temp=temp.next;
            sz--;
        }
        prev.next=null;
        prev=head;
        head=rev(head);
        prev.next=rev(temp);
        return rev(head);

    }
    ListNode rev(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
}