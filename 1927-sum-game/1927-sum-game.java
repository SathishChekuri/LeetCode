class Solution {
    public boolean sumGame(String num) {
        int lsum=0,rsum=0,lq=0,rq=0;
        int n=num.length();
        for(int i=0;i<n/2;i++){
            char c=num.charAt(i);
            char ch=num.charAt(n/2+i);
            if(c=='?') lq++;
            else lsum+=c-'0';
            if(ch=='?') rq++;
            else rsum+=ch-'0';
    }
    int diff=lsum-rsum;
    int qdiff=lq-rq;
    if(qdiff%2!=0) return true;
    return diff+9*(qdiff/2)!=0;
    }
}