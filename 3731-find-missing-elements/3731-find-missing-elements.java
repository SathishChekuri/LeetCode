class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       Arrays.sort(nums);
       List<Integer> ar=new ArrayList<>();
       for(int i=0;i<nums.length-1;i++){
        while(nums[i]+1<nums[i+1]){
            ar.add(nums[i]+1);
            nums[i]++;
        }
       }
       return ar;
    }
}