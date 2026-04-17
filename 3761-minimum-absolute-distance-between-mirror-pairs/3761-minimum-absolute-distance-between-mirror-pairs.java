class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> pre = new HashMap<>();
        int n = nums.length, res = n;
        for (int i = 0; i < n; ++i) {
            if (pre.containsKey(nums[i])) {
                res = Math.min(res, i - pre.get(nums[i]));
            }
            pre.put(rev(nums[i]), i);
        }

        return (res < n) ? res : -1;
    }
    public int rev(int n){
        int s=0;
        while(n>0){
            s=s*10+n%10;
            n/=10;
        }
        return s;
    }
}