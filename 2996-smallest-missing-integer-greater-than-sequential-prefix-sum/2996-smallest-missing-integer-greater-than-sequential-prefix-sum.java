class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        HashSet<Integer> hs=new HashSet<>();
        hs.add(nums[0]);
        boolean prf=true;
        for(int i=1;i<nums.length;i++){
            if(prf&&nums[i]==nums[i-1]+1) sum+=nums[i];
            else prf=false;
            hs.add(nums[i]);
        }
        while(true){
            if(!hs.contains(sum)) return sum;
            sum++;
        }
    }
}