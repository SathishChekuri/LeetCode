class Solution {
    public boolean judgeCircle(String moves) {
        int r=0,l=0;
        for(char c:moves.toCharArray()){
         if(c=='R') r++;
         else if(c=='L') r--;
         else if(c=='U') l++;
         else l--;
        }
        if(r==0&&l==0) return true;
        return false;
    }
}