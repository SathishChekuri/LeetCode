class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> hs=new HashMap<>();
       for(int i:nums){
        hs.put(i,hs.getOrDefault(i,0)+1);
       } 
       int mx=0;
       for(int i:hs.keySet()){
        mx=Math.max(hs.get(i),mx);
       }
       int cunt=0;
       for(int i:hs.keySet()){
        if(hs.get(i)==mx) cunt+=mx;
       }
       return cunt;
    }
}