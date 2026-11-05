class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i:arr1){
            boolean dist=true;
            for(int j:arr2){
                if(Math.abs(i-j)<=d){
                    dist=false;
                    break;
                }
            }
            if(dist) c++;
        }
        return c;
    }
}