class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x=0;
        int y=0;
        int mxds=0;
        int ind=0;
        int [][]d={{0,1},{1,0},{0,-1},{-1,0}};
        HashSet<String> hs=new HashSet<>();
        for(int [] ar:obstacles){
          hs.add(ar[0]+","+ar[1]);
        }
        for(int c:commands){
           if(c==-1) ind=(ind+1)%4;
           else if(c==-2) ind=(ind+3)%4;
           else{
            for(int i=0;i<c;i++){
                int nx=x+d[ind][0];
                int ny=y+d[ind][1];
                if(hs.contains(nx+","+ny)) break;
                x=nx;
                y=ny;
                mxds=Math.max(mxds,x*x+y*y);
            }
           }
        }
        return mxds;
    }
}