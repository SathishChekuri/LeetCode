class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
       int [] arr=new int[26];
       int [] ar=new int[26];
       for(char c:s1.toCharArray()){
        arr[c-'a']++;
       }
       int i=0;
       int n=s1.length();
       for(i=0;i<n;i++){
        ar[s2.charAt(i)-'a']++;
       }
       if(Arrays.equals(arr,ar)) return true;
       for(i=n;i<s2.length();i++){
        ar[s2.charAt(i)-'a']++;
        ar[s2.charAt(i-n)-'a']--;
        if(Arrays.equals(arr,ar)) return true;
       }
        return false;
    }
}