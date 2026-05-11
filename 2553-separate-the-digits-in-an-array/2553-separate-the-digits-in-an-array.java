class Solution {
    public int[] separateDigits(int[] nums) {
       String s="";
       for(int i:nums) s+=i;
       int arr[]=new int[s.length()];
       int i=0;
       for(char c:s.toCharArray()){
        arr[i++]=c-'0';
       } 
       return arr;
    }
}