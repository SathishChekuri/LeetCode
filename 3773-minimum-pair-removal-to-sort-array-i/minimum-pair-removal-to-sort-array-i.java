class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i:nums){
            arr.add(i);
        }
        int opr=0;
        while(true){
            boolean sorted=true;
            for(int i=0;i<arr.size()-1;i++){
                if(arr.get(i)>arr.get(i+1)){
                    sorted=false;
                    break;
                }
            }
            if(sorted) return opr;
            int mn=Integer.MAX_VALUE;
            int index=-1;
            for(int i=0;i<arr.size()-1;i++){
                int sum=arr.get(i)+arr.get(i+1);
                if(sum<mn){
                    mn=sum;
                    index=i;
                }
            }
            arr.set(index,mn);
            arr.remove(index+1);
            opr++;
        }
    }
}