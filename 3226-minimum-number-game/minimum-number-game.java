class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        Arrays.sort(nums);
        int arr[]=new int[n];
        while(i<n){
            int s1=nums[i++];
            int s2=nums[i++];
            arr[j++]=s2;
            arr[j++]=s1;
        }
        return arr;
    }
}