class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0,n=mat.length-1;
        int s=0;
        while(i<mat.length){
            s+=mat[i][i];
            if(i==n){
                i++;
                n--;
             continue;
            }
            s+=mat[n--][i++];
        }
        return s;
    }
}