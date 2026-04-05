class Solution {
    public boolean judgeCircle(String moves) {
        int lr=0,up=0;
        for(char c:moves.toCharArray()){
            if(c=='U') up++;
            else if(c=='D') up--;
            else if(c=='L') lr++;
            else lr--;
        }
        if(lr==0&&up==0) return true;
        return false;
    }
}