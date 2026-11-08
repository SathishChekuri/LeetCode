class Solution {
    public int countServers(int[][] grid) {
        HashMap<Integer,Integer> r=new HashMap<>();
        HashMap<Integer,Integer> c=new HashMap<>();
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   r.put(i,r.getOrDefault(i,0)+1);
                   c.put(j,c.getOrDefault(j,0)+1);
                }
            }
        }
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   if(r.get(i)>1||c.get(j)>1) cnt++;
                }
            }
        }
        return cnt;
    }
}