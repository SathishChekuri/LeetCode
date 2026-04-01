class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int prev=1,f=1;
        while(n-->2){
            int t=f;
            f+=prev;
            prev=t;
        }
        return f;
    }
}