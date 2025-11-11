class Solution {
    public String sortSentence(String s) {
        String [] a=s.split(" ");
        String [] a1=new String[a.length];
        StringBuilder b=new StringBuilder();
        int i;
        for(String s1:a){
            a1[(s1.charAt(s1.length()-1)-'0')-1]=s1.substring(0,s1.length()-1);
        }
        for(i=0;i<a1.length-1;i++){
            b.append(a1[i]+" ");
        }
        b.append(a1[i]);
        return b.toString();
    }
}