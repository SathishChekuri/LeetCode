class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int [] ar=new int[n*n];
        int [] res=new int[2];
        int c=0,s=0,x=n*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ar[grid[i][j]-1]+=1;
                if(ar[grid[i][j]-1]>1){  
                 c=grid[i][j];
                }
                s+=grid[i][j];
            }
           
        }
        res[0]=c;
        res[1]=c+(x*(x+1)/2-s);
        return res;
    }
}