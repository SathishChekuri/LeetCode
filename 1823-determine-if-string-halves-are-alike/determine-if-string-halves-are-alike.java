class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String r="AEIOUaeiou";
        int c=0;
        for(int i=0;i<n/2;i++){
           if(r.contains(s.charAt(i)+"")) c++;
        }
        for(int i=n/2;i<n;i++){
            if(r.contains(s.charAt(i)+"")) c--;
        }
        return (c==0)?true:false;
    }
}