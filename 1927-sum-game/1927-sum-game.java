class Solution {
    public boolean sumGame(String num) {
        int lsum=0,rsum=0,lq=0,rq=0;
        int n=num.length();
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?') lq++;
            else lsum+=num.charAt(i)-'0';
            if(num.charAt(n/2+i)=='?') rq++;
            else rsum+=num.charAt(n/2+i)-'0';
    }
    int diff=lsum-rsum;
    int qdiff=lq-rq;
    if(qdiff%2!=0) return true;
    return diff!=-9*(qdiff/2);
    }
}