class Solution {
    public String sortVowels(String s) {
       String o="";
        for(char c:s.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                o+=c;
            }
        }
        if(o.length()==0) return s;
        char arr[]=o.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder(s);
        int k=0;
        for(int i=0;i<sb.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
                sb.setCharAt(i,arr[k++]);
        }
        }
        return sb.toString();
        
    }
}