class Solution {
    public int[] findDegrees(int[][] matrix) {
       int edge[]=new int[matrix.length];
       int j=0;
       for(int arr[]:matrix){
        int c=0;
        for(int i:arr){
            if(i==1) c++;
        }
        edge[j++]=c;
       }
        return edge;
    }
}