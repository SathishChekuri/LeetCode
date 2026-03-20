class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n=grid.length,m=grid[0].length;
        int res[][]=new int[n-k+1][m-k+1];
        if(k==1) return res;
        for(int r=0;r<=n-k;r++){
            for(int c=0;c<=m-k;c++){
                List<Integer> arr=new ArrayList<>();
                for(int i=r;i<r+k;i++){
                    for(int j=c;j<c+k;j++){
                        arr.add(grid[i][j]);
                    }
                }
                Collections.sort(arr);
                int prv=arr.get(0),mn=Integer.MAX_VALUE;
                for(int i=1;i<arr.size();i++){
                    if(arr.get(i)!=prv){
                        mn=Math.min(mn,arr.get(i)-prv);
                    }
                    prv=arr.get(i);
                }
                res[r][c]=(mn==Integer.MAX_VALUE)?0:mn;
            }
        }
        return res; 
    }
}