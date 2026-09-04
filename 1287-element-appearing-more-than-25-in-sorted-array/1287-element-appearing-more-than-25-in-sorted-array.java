class Solution {
    public int findSpecialInteger(int[] arr) {
        int ele=arr[0],c=0;
        for(int i:arr){
            if(c>arr.length/4) return ele;
            if(i==ele) c++;
            else{
                ele=i;
                c=1;
            }
        }
        return ele;
    }
}