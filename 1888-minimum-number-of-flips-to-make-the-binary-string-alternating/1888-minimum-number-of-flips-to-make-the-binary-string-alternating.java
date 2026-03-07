class Solution {
    public int minFlips(String s) {
        int zflips=0;//binary string 0101010101...
        int oflips=0;//binary string 1010101010...
        String t=s+s;
        int l=0,mn=Integer.MAX_VALUE;
        for(int r=0;r<t.length();r++){
            if((r%2==0&&t.charAt(r)=='1')||(t.charAt(r)=='0'&&r%2==1)) zflips++;
            else oflips++; 
            if(r-l+1>=s.length()){
                mn=Math.min(mn,Math.min(zflips,oflips));
                if((l%2==0&&t.charAt(l)=='1')||(t.charAt(l)=='0'&&l%2==1)) zflips--;
                 else oflips--; 
                 l++;
            }
        }
        return mn;
        
    }
}