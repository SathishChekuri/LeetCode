class Solution {
    public int countDigits(int num) {
        int c=0;
        String str=num+"";
        for(int i=0;i<str.length();i++){
            int p=Integer.parseInt(str.charAt(i)+"");
            if(num%p==0){
                c++;
                str.replace(p+"","");
            }
        }
        return c;
    }
}