class Solution {
    public boolean validDigit(int n, int x) {
        int c=0;
        while(n>0){
            int d=n%10;
            if(d==x){
                if(n/10==0) return false;
                c++;
            }
            n/=10;
        }
        return c>0;
    }
}