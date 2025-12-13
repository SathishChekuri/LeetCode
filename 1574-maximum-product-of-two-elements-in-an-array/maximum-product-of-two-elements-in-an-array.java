class Solution {
    public int maxProduct(int[] nums) {
        int p=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int p1=(nums[i]-1)*(nums[j]-1);
                if(p1>p) p=p1;
            }
        }
        return p;
    }
}