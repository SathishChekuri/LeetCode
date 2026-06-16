class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        int i=a.length()-1,j=b.length()-1;
        while(i>=0||j>=0||c!=0){
             int sum=c;
            if(i>=0){
             int a1=a.charAt(i)-'0';
             sum+=a1;
             i--;
            }
            if(j>=0){
            int b1=b.charAt(j)-'0';
            sum+=b1;
            j--;
            }
            sb.append(sum%2);
            c=sum/2;
        }
        return sb.reverse().toString();
    }
}