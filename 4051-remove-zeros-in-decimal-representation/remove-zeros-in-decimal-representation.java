class Solution {
    public long removeZeros(long n) {
     long s=0,r=0;
     while(n>0){
        r=n%10;
        if(r!=0) s=s*10+r;
        n/=10;
     }
     r=0;
     while(s>0){
       r=r*10+s%10;
       s/=10;
     }
     return r;
    }
}