class Solution {
    public String sortSentence(String s) {
        String [] a=s.split(" ");
        //String [] a1=new String[a.length];
        StringBuilder b=new StringBuilder();
        for(int i=0;i<a.length;i++){
             for(String s1:a){
                if((s1.charAt(s1.length()-1)-'0')-1==i){
                    b.append(s1.substring(0,s1.length()-1)+" ");
                    break;
                }
             }      
        }
        return b.toString().trim();
}
}