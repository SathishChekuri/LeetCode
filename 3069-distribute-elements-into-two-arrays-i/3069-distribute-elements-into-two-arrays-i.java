class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> ar1=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();
        ar1.add(nums[0]);
        ar2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(ar1.get(ar1.size()-1)>ar2.get(ar2.size()-1)) ar1.add(nums[i]);
            else ar2.add(nums[i]);
        }
        int i=0,j=0;
        int ind=0;
        while(i<ar1.size()) nums[ind++]=ar1.get(i++);
        while(j<ar2.size()) nums[ind++]=ar2.get(j++);
        return nums;
    }
}