class Solution {
    public double myPow(double x, int n) {
        double res=1.0000;
        long N=n;
        if(n<0){
            N=-N;
            x=1/x;
        }
        while(N!=0){
            if(N%2==1) res*=x;
            x*=x;
            N/=2;
        }
        return res;
    }
}