class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:arr) hs.put(i,hs.getOrDefault(i,0)+1);
        Set<Integer> frq=new HashSet<>();
        for(int i:hs.values()){
            if(frq.contains(i)) return false;
            frq.add(i);
        }
        return true;
    }
}