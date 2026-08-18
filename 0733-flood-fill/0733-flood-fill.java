class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor=image[sr][sc];
        int [][] ans=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++) ans[i][j]=image[i][j];
        }
        dfs(sr,sc,image,ans,color,initialColor);
        return ans;
    }
    void dfs(int r,int c,int [][]img,int [][]ans,int color,int initialColor){
        ans[r][c]=color;
        if(r+1<img.length&&ans[r+1][c]!=color&&ans[r+1][c]==initialColor) dfs(r+1,c,img,ans,color,initialColor);
         if(c-1>=0&&ans[r][c-1]!=color&&ans[r][c-1]==initialColor) dfs(r,c-1,img,ans,color,initialColor);
        if(c+1<img[0].length&&ans[r][c+1]!=color&&ans[r][c+1]==initialColor) dfs(r,c+1,img,ans,color,initialColor);
        if(r-1>=0&&ans[r-1][c]!=color&&ans[r-1][c]==initialColor) dfs(r-1,c,img,ans,color,initialColor);
    }
}