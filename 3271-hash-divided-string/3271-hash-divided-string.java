class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<n){
            int sum=0;
            for(int j=i;j<i+k;j++){
               sum+=(s.charAt(j)-'a');
               sum%=26;
            }
            sb.append((char)('a'+sum));
            i+=k;
        }
        return sb.toString();
    }
}