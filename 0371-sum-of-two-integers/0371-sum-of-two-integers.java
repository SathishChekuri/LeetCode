class Solution {
    public int getSum(int a, int b) {
        if(a==0) return b;
        while(b!=0){
            int c=a&b;
            a=a^b;
            b=c<<1;
        }
        return a;
    }
}