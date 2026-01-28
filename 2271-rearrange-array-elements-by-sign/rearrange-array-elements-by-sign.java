class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> a1=new ArrayList<>();
       List <Integer> a2=new ArrayList<>();
       List <Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
                if(nums[i]>=0) a1.add(nums[i]);
                else a2.add(nums[i]);
        }
        int c=0;
        for(int i=0;i<nums.length/2;i++){
           ans.add(a1.get(i));
            ans.add(a2.get(i));
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans.get(i);
        }
        return nums;
    }
}