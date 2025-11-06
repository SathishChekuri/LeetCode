class Solution {
    public int maxFreqSum(String s) {
        int max=0,max1=0;
        String r="aeiou";
        int [] ar=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            ar[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(r.contains(c+"")){
                if(max<ar[c-'a']) max=ar[c-'a'];
            }
            else{
                if(max1<ar[c-'a']) max1=ar[c-'a'];
            }
        }
        return max+max1;
    }
}