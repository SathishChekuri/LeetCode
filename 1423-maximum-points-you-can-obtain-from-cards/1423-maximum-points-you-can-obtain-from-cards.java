class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0,rightsum=0,mxsum=0,r=cardPoints.length-1;
        for(int i=0;i<k;i++) leftsum+=cardPoints[i];
        mxsum=leftsum;
        for(int i=k-1;i>=0;i--){
            leftsum-=cardPoints[i];
            rightsum+=cardPoints[r--];
            mxsum=Math.max(leftsum+rightsum,mxsum);
        }
        return mxsum;
    }
}