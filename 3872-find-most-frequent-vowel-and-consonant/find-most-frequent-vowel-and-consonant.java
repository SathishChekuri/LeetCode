class Solution {
    public int maxFreqSum(String s) {
        int max=0,max1=0;
        int [] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for(char c:s.toCharArray()){
           if(vov(c)){
                max=Math.max(max,arr[c-'a']);
            }
            else{
                 max1=Math.max(max1,arr[c-'a']);
            }
        }
        return max+max1;
    }
    static boolean vov(char a){
        return a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
    }
}