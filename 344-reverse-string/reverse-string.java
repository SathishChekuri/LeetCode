class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int n=s.length-1;
        while(i<n){
            char r=s[i];
            s[i]=s[n];
            s[n]=r;
            i++;
            n--;
        }
        System.out.print(Arrays.toString(s));
    }
}