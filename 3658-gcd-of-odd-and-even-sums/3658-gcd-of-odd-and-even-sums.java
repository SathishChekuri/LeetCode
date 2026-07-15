class Solution {
    public int gcdOfOddEvenSums(int n) {
        int ev=2*(n*(n+1)/2);
        int od=n*n;
        System.out.println(ev+" "+od);
        if(ev>od) return gcd(od,ev);
        return gcd(ev,od);
    }
    int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}