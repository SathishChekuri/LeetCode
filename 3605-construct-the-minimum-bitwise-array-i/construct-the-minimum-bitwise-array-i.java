class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int []arr=new int[nums.size()];
        for(int j=0;j<arr.length;j++){
           // arr[i]=(nums.get(i))|(nums.get(i)+1);
           int org=nums.get(j);
           int res=-1;
           for(int i=1;i<org;i++){
            if((i|(i+1))==org){
                res=i;
                break;
            }
           }
            arr[j]=res;
        }
        return arr;
    }
}