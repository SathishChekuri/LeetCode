class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ar=new ArrayList<>();
        int n=Integer.MIN_VALUE;
        for(int i:candies) n=(i>n)?i:n;
        for(int i=0;i<candies.length;i++){
            ar.add((candies[i]+extraCandies>=n)?true:false);
        }
        return ar;
    }
}