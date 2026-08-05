class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        int t=k;
        while(q.size()>1){
            if(t==1){
                t=k;
                q.remove();
            }
            else{
                q.add(q.remove());
                t--;
            }
        }
        return q.peek();
    }
}