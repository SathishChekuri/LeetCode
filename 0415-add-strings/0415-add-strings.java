class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int c=0,i=num1.length()-1,j=num2.length()-1;
        while(i>=0||j>=0||c>0){
            int sum=c;
            if(i>=0) sum+=(num1.charAt(i)-'0');
            if(j>=0) sum+=(num2.charAt(j)-'0');
            sb.insert(0,sum%10);
            c=sum/10;
            i--;
            j--;
        }
        return sb.toString();
    }
}