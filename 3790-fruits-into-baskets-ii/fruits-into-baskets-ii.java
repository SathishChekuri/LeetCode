class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c=0;
        int n=fruits.length;
        for(int i=0;i<n;i++){
            int pl=0;
            for(int j=0;j<n;j++){
                if(fruits[i]<=baskets[j]){
                    pl=1;
                    baskets[j]=0;
                    break;
                }
            }
            if(pl==0) c++;
        }
        return c;
    }
}