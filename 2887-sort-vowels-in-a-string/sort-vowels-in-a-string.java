class Solution {
    public String sortVowels(String s) {
       // StringBuilder b=new StringBuilder(s);
        String o="AEIOUaeiou";
        int cnt=0;
        for(char c:s.toCharArray()){
            if(o.contains(c+"")) cnt++;
        }
        if(cnt==0) return s;
        char arr[]=new char[cnt];
        int in=0;
        for(char c:s.toCharArray()){
            if(o.contains(c+"")) arr[in++]=c;
        }
        Arrays.sort(arr);
        String r="";
        in=0;
        for(char c:s.toCharArray()){
            if(o.contains(c+"")) r+=arr[in++]; 
            else r+=c;
        }
        return r;
    }
}