class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String res="";
        int i=0,j=0;
        while(i<s.length()){
            if(s.charAt(i)=='1'){
                k--;
            }
            while(k<0){
                if(s.charAt(j)=='1') k++;
                j++;
            } 
            if(k==0){
                 while(j<s.length()&&s.charAt(j)=='0') j++;
                String temp=s.substring(j,i+1);
                if(res.equals("")) res=temp;
                else if(temp.length()<res.length()||(temp.length()==res.length()&&temp.compareTo(res)<0)) res=temp;
            }
             i++;
        }
        return res;
    }
}