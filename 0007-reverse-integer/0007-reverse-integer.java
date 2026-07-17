class Solution {
    public int reverse(int x) {
        boolean neg=false;
        if(x<=Integer.MIN_VALUE||x>=Integer.MAX_VALUE) return 0;
        if(x<0){
            neg=true;
            x=-x;
        }
        long t=0;
        while(x>0){
            t=t*10+x%10;
            x/=10;
        }
        if(t<=Integer.MIN_VALUE||t>=Integer.MAX_VALUE) return 0;
        if(neg) return (int)-t;
        return (int)t;
    }
}