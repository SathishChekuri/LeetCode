class Solution {
    public int countPoints(String rings) {
        int n=rings.length();
        int r[]=new int[10];
        int b[]=new int[10];
        int g[]=new int[10];
        for(int i=0;i<n-1;i+=2){
           int a=rings.charAt(i+1)-'0';
           if(rings.charAt(i)=='B') b[a]++;
           else if(rings.charAt(i)=='R') r[a]++;
           else  g[a]++;
        }
        int c=0;
        for(int i=0;i<10;i++){
            if(r[i]>0&&b[i]>0&&g[i]>0) c++;
        }
        return c;
    }
}