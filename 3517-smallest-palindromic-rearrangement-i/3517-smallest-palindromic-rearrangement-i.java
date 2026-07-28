class Solution {
    public String smallestPalindrome(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        char mid='0';
        for(int i=0;i<26;i++){
            int t=arr[i]/2;
            char c=(char)('a'+i);
            if(arr[i]%2==1) mid=c;
            while(t-->0) sb.append(c);
        }
        String firstHalf=sb.toString();
        if(mid!='0') firstHalf+=mid;
        return firstHalf+sb.reverse().toString();
    }
}