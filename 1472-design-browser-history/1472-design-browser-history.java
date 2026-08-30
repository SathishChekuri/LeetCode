class BrowserHistory {
    Node curr;
    public BrowserHistory(String homepage) {
       curr=new Node(homepage);
        
    }
    
    public void visit(String url) {
       curr.next=new Node(url);
       curr.next.prev=curr;
       curr=curr.next;
    }
    
    public String back(int steps) {
        while(steps-->0){
            if(curr.prev==null) break;
            curr=curr.prev;
        }
        return curr.val;
    }
    
    public String forward(int steps) {
       while(steps-->0){
        if(curr.next==null) break;
        curr=curr.next;
       }
        return curr.val;
    }
}
class Node{
    String val;
    Node next;
    Node prev;
    Node(String val){
        this.val=val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */