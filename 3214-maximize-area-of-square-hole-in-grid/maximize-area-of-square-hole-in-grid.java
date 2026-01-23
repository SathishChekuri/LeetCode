class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int mxch=1;
        int mxcv=1;
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int temph=1;
        int tempv=1;
        int vlength=vBars.length;
        int hlength=hBars.length;
        for(int i=1;i<Math.max(hlength,vlength);i++){
            if(i<hlength&&(hBars[i]-hBars[i-1]==1)){
                temph++;
            }
           else if(i<hlength){
                mxch=Math.max(mxch,temph);
                temph=1;
          }
            if((i<vlength)&&(vBars[i]-vBars[i-1]==1)) tempv++;
            else if(i<vlength){
                    mxcv=Math.max(mxcv,tempv);
                    tempv=1;
                }
        }
        mxch=Math.max(mxch,temph);
        mxcv=Math.max(mxcv,tempv);
        int mxc=Math.min(mxch,mxcv);
        mxc+=1;
        return mxc * mxc;
    }
}
