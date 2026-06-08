class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] arr=new int[nums.length];
        int c=0,j=0;
        for(int i:nums){
            if(i<pivot) arr[j++]=i;
            if(i==pivot) c++;
        }
        while(c-->0) arr[j++]=pivot;
        for(int i:nums){
            if(i>pivot) arr[j++]=i;
        }
        return arr;
    }
}