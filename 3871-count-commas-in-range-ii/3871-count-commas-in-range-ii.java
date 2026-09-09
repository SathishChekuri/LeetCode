class Solution {
    public long countCommas(long n) {
        long ans=0;
        if(n==1000_000_000_000_000L){
            ans+=5;
            n--;
        }
        if(n>999_999_999_999L){
            ans+=(n-999_999_999_999L)*4;
            n=999_999_999_999L;
        }
        if(n>999_999_999L){
            ans+=(n-999_999_999L)*3;
            n=999_999_999L;
        }
        if(n>999_999L){
            ans+=(n-999_999L)*2;
            n=999_999L;
        }
        if(n>999){
            ans+=(n-999);
        }
        return ans;
    }
}