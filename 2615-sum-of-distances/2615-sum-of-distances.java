class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.putIfAbsent(nums[i], new ArrayList<>());
            hm.get(nums[i]).add(i);
        }
        for(ArrayList<Integer> al : hm.values()){
            int size = al.size();
            if(size==1)continue;
            long totalsum=0;
            for(int i:al)totalsum+=i;
            long prefixsum=0;
            for(int i=0;i<size;i++){
                int index=al.get(i);
                long left = i;
                long right = size-i-1;
                long leftsum=prefixsum;
                long rightsum= totalsum-prefixsum-index;
                res[index]= (index*left- leftsum) + (rightsum-index*right);
                prefixsum+=index;
            }
        }
        return res;
    }
}