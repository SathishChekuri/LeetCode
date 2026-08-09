class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
        long dd=Math.abs((long)dividend);
        long ds=Math.abs((long)divisor);
        long c=0;
        while(dd>=ds){
            long temp=ds;
            int multiple=1;
            while(dd>=(temp<<1)){
                temp=temp<<1;
                multiple<<=1;
            }
            dd-=temp;
            c+=multiple;
        }
        if(dividend<0^divisor<0) c=-c;
        return (int)c;
    }
}