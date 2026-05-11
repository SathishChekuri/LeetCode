class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> hs=new HashMap<>();
        for(int i:arr){
                hs.put(i,hs.getOrDefault(i,0)+1);
        }
        int res=-1;
        for(int i:hs.keySet()){
            if(i==hs.get(i)){
                res=Math.max(i,res);
            }
        }
        return res;
    }
}