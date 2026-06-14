class Solution {
    public int compress(char[] chars) {
       char p=chars[0];
       String res="";
       int c=1;
       for(int i=1;i<chars.length;i++){
        if(chars[i]==p) c++;
        else{
            if(c>1) res+=p+""+c;
            else res+=p;
            p=chars[i];
            c=1;
        }
       }
       System.out.println(res);
       res+=(c>1)?p+""+c:p;
        for(int i = 0; i < res.length(); i++){
        chars[i] = res.charAt(i);
       }
       return res.length();
    }
}