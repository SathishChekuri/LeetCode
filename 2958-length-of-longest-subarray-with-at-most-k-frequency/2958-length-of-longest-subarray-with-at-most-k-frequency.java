class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int mx=1;
        int i=0,j=0;
            HashMap<Integer,Integer> hs=new HashMap<>();
           while(j<nums.length){
                hs.put(nums[j],hs.getOrDefault(nums[j],0)+1);
                while(hs.get(nums[j])>k){
                    if(hs.get(nums[i])<=1) hs.remove(nums[i]);
                    else hs.put(nums[i],hs.getOrDefault(nums[i],0)-1);
                    i++;
                }
                mx=Math.max(mx,j-i+1);
                j++;
           }
        return mx;
    }
}