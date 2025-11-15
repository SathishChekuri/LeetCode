class Solution {
    public int divide(int dividend, int divisor) {
        if(-2147483648==dividend&&divisor==-1) return 2147483647;
        return dividend/divisor;
    }
}