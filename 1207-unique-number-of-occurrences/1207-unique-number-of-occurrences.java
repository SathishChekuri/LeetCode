class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:arr) hs.put(i,hs.getOrDefault(i,0)+1);
        HashMap<Integer,Integer> frq=new HashMap<>();
        for(int i:hs.values()) frq.put(i,frq.getOrDefault(i,0)+1);
        for(int i:frq.values()) if(i!=1) return false;
        return true;
    }
}