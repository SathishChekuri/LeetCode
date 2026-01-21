class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[]=new int[nums.size()];
        for(int i=0;i<arr.length;i++){
            int curr=nums.get(i);
            if (curr!=2) arr[i]=curr-((curr+1)&(-curr-1))/2;
             else arr[i]=-1;
        }
        return arr;
    }
}