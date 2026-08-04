class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int mx=1;
        for(int i:hs){
         if(!hs.contains(i-1)){
                int c=1;
                int n=i;
                while(hs.contains(n+1)){
                    n++;
                    c++;
                }
                mx=Math.max(mx,c);
         }
         
        }
        return mx;
    }
}