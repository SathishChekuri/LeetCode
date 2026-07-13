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
        int n=0;
        ListNode temp=head,ans=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        if(n==1) return null;
        ListNode prv=null;
        for(int i=0;i<n/2;i++){
            prv=head;
            head=head.next;
        }
        if(prv!=null&&head!=null) prv.next=head.next;
        return ans;
    }
}