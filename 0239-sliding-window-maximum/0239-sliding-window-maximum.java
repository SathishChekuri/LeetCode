class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||k==0) return new int[]{};
        int n=nums.length;
        int [] r=new int[n-k+1];
        int ind=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!q.isEmpty()&&q.peek()<i-k+1) q.poll();
            while(!q.isEmpty()&&nums[q.peekLast()]<nums[i]) q.pollLast();
            q.offer(i);
            if(i>=k-1) r[ind++]=nums[q.peek()];
        }
        return r;
    }
}