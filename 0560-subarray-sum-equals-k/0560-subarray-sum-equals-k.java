class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int c=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k) c++;
            if(hs.containsKey(sum-k)){
                c+=hs.get(sum-k);
            }
         hs.put(sum,hs.getOrDefault(sum,0)+1);
        }
        return c;
    }
}