class Solution {
    public void reverseString(char[] s) {
       for(int i=0;i<s.length/2;i++){
            char r=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=r;
        }
        System.out.print(Arrays.toString(s));
    }
}