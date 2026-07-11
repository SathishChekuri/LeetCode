class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> hs=new HashMap<>();
        for(int i:nums) hs.put(i,hs.getOrDefault(i,0)+1);
        for(int i:hs.keySet()){
            if(hs.get(i)==1) return i;
        }
        return -1;
    }
}