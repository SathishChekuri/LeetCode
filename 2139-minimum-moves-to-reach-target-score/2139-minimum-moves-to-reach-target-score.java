class Solution {
    public int minMoves(int target, int maxDoubles) {
        int c=0,mul=maxDoubles;
        while(mul>0){
            if(target==1) return c;
            if(target%2==1){
                c++;
                target--;
            }
            c++;
            target/=2;
            mul--;
        }
        return target+c-1;
    }
}