class Solution {
    public boolean checkDivisibility(int n) {
        long mult=1,sum=0;
        int t=n;
        while(t>0){
            mult*=t%10;
            sum+=t%10;
            t/=10;
        }
        return (long)n%(sum+mult)==0;
    }
}