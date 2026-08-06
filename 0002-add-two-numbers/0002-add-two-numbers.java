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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int cr=0;
        ListNode head=new ListNode();
        ListNode ans=head;
        while(l1!=null||l2!=null||cr!=0){
                int s=cr;
                if(l1!=null){
                    s+=l1.val;
                    l1=l1.next;
                }
                if(l2!=null){
                    s+=l2.val;
                    l2=l2.next;
                }
                cr=s/10;
                head.next=new ListNode(s%10);
                head=head.next;
        }
        return ans.next;
    }
}