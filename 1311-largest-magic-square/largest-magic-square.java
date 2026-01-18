class Solution {
    public int largestMagicSquare(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        int size=Math.min(r,c);
        while(size>0){
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(i+size<=r&&j+size<=c){
                        if(isValid(grid,r,c,i,j,size)) return size;
                    }
                }
            }
           
         size--;
        }
        return 0;
    }
    static boolean isValid(int [][] grid ,int r,int c,int i,int j,int size){
        int sum=0;
        for(int x=i;x<i+size;x++){
            int summ=0;
            for(int y=j;y<j+size;y++){
                summ+=grid[x][y];
            }
            if(x==i) sum=summ;
            else if(sum!=summ) return false;
        }
         for(int x=j;x<j+size;x++){
            int summ=0;
            for(int y=i;y<i+size;y++){
                summ+=grid[y][x];
            }
            if(sum!=summ) return false;
        }
        int summ=0;
        for(int k=0;k<size;k++){
            summ+=grid[i+k][j+k];
        }
        if(sum!=summ) return false;
        summ=0;
        for(int k=0;k<size;k++){
            summ+=grid[i+k][j+size-1-k];
        }
        if(sum!=summ) return false;
        return true;
    }
}