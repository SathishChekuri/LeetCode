class MyStack {
        Queue<Integer> q;
        Queue<Integer> st;
    public MyStack() {
        q=new LinkedList<>();
        st=new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
       while(q.size()>1){
         st.offer(q.poll());
       }
      int val =  q.poll();
       while(st.size()!=0){
        q.offer(st.poll());
       }
       return val;
    }
    
    public int top() {
        int val=0;
        while(!q.isEmpty()){
            if(q.size()==1) val=q.peek();
            st.offer(q.poll());
        }
          while(st.size()!=0){
        q.offer(st.poll());
       }
        return val;
    }
    
    public boolean empty() {
        return st.isEmpty()&&q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */