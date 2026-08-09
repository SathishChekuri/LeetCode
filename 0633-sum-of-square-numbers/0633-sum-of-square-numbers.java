class Solution {
    public boolean judgeSquareSum(int c) {
        HashSet<Long> hs=new HashSet<>();
        for(long i=0;i*i<=c;i++){
            if(i*i*2==c) return true;
            if(hs.contains((long)c-i*i)) return true;
            hs.add((long)i*i);
        }
        return false;
    }
}