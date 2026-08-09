/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null){
            Node nxt=temp.next;
            temp.next=new Node(temp.val);
            temp.next.next=nxt;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
             temp.next.random=(temp.random!=null)?temp.random.next:null;
            temp=temp.next.next;
        }
        Node dummy=new Node(-1);
        Node ans=dummy;
        temp=head;
        while(temp!=null&&temp.next!=null){
            Node t=temp.next;
            temp.next=temp.next.next;
            dummy.next=t;
            temp=temp.next;
           dummy=dummy.next;
        }
        return ans.next;
    }
}