class Solution {
    public long removeZeros(long n) {
        String s=n+"";
        return Long.parseLong(s.replace("0",""));
    }
}