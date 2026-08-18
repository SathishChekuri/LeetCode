class Solution {
    public int largestInteger(int[] nums, int k) {
        int [] frq=new int[51];
        int mx=-1;
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer> hs=new HashSet<>();
             for(int j=i;j<i+k;j++){
                    hs.add(nums[j]);
             }
             for(int j:hs) frq[j]++;
        }
        for(int i=0;i<nums.length;i++){
          if(frq[nums[i]]==1) mx=Math.max(mx,nums[i]);
        }
        return mx;
    }
}