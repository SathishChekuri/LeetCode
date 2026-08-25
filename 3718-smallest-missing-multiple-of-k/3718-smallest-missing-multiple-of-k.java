class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums) hs.add(i);
        int d=k;
        while(true){
            if(!hs.contains(k)) return k;
            k+=d;
        }
    }
}