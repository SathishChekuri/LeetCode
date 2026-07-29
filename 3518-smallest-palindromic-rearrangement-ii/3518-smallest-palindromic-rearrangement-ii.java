class Solution {
    long limit=1000001L;
    public String smallestPalindrome(String s, int k) {
        char mid='0';
        StringBuilder sb=new StringBuilder();
        int cnt[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            cnt[c-'a']++;
        }
        int half[]=new int[26];
        for(int i=0;i<26;i++){
            if(cnt[i]%2==1) mid=(char)('a'+i);
            half[i]=cnt[i]/2;
        }
        if(count(half)<k) return "";
        int len=s.length()/2;
        for(int i=0;i<len;i++){
            for(int j=0;j<26;j++){
                if(half[j]==0) continue;
                half[j]--;
                long ways=count(half);
                if(ways>=k){
                    sb.append((char)('a'+j));
                    break;
                }
                k-=ways;
                half[j]++;
            }
        }
        String hlf=sb.toString();
        if(mid!='0') hlf+=mid+"";
        return hlf+sb.reverse().toString();
    }
    long count(int []arr){
        int rem=0;
        for(int i:arr){
            rem+=i;
        }
        long ways=1;
        for(int i=0;i<26;i++){
            if(arr[i]==0) continue;
            ways*=ncr(rem,arr[i]);
            if(ways>=limit) return limit;
            rem-=arr[i];
        }
        return ways;
    }
    long ncr(int n,int r){
        long res=1;
        r=Math.min(n-r,r);
        for(int i=1;i<=r;i++){
            res=res*(n-r+i)/i;
            if(res>=limit) return limit;
        }
        return res;
    }
}