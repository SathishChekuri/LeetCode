class Solution {
    public int divide(int dividend, int divisor) {
        if(Integer.MIN_VALUE==dividend&&divisor==-1) return 2147483647;
        return dividend/divisor;
    }
}