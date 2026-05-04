class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int arr[]:matrix) reverse(arr);
    }
    void reverse(int[] arr){
        int i=0;
        int n=arr.length-1;
        while(i<n){
            int t=arr[i];
            arr[i]=arr[n];
            arr[n]=t;
            i++;
            n--;
        }
    }
}