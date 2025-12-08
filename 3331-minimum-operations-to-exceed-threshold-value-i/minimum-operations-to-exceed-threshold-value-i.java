class Solution {
    public int minOperations(int[] nums, int k) {
        //Arrays.sort(nums);
        int c=0;
        for(int i :nums){
            if(i<k) c++;
        }
        return c;
    }
}