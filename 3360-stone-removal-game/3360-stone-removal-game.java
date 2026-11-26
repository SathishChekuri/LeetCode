class Solution {
    public boolean canAliceWin(int n) {
        int ch=1;
        int d=10;
        while(n>=d){
            n-=d;
            if(ch==1) ch=0;
            else ch=1;
            d--;
        }
        return  ch==0;
    }
}