class Solution {
    public String smallestPalindrome(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        char md='0';
        for(int i=0;i<26;i++){
            int t=arr[i]/2;
            char c=(char)('a'+i);
            if(arr[i]%2==1) md=c;
            while(t-->0) sb.append(c);
        }
        int mid=sb.length();
        String rev=sb.toString();
        if(md!='0') rev+=md;
        return rev+sb.reverse().toString();
    }
}