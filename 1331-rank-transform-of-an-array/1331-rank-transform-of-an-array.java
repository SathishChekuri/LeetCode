class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int t[]=Arrays.copyOf(arr,arr.length);
       Arrays.sort(t);
       HashMap<Integer,Integer> hs=new HashMap<>();
       int r=1;
       for(int i:t){
        if(!hs.containsKey(i)) hs.put(i,r++);
       }
       for(int i=0;i<arr.length;i++){
        arr[i]=hs.get(arr[i]);
       }
       return arr;
    }
}