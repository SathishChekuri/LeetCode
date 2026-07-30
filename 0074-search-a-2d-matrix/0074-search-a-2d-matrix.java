class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int m=matrix[0].length;
        int r=matrix.length*m-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(matrix[mid/m][mid%m]==target){
                return true;
            }
            if(matrix[mid/m][mid%m]<target){
                l=mid+1;
            }
            else r=mid-1;
        }
        return false;
    }
}