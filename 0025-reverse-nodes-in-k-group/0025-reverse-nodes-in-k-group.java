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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head,prev=head,nextnode=null,kth=null;
        while(temp!=null){
            kth=kthNode(temp,k);
            if(kth==null){
                if(prev!=null) prev.next=temp;
                break;
            }
            nextnode=kth.next;
            kth.next=null;
            reverse(temp);
            if(head==temp){
                head=kth;
            }
            else{
                prev.next=kth;
            }
            prev=temp;
            temp=nextnode;

        }
        return head;
    }
    void reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
    }
    ListNode kthNode(ListNode head,int k){
        while(k-->1&&head!=null){
            head=head.next;
        }
        return head;
    }
}