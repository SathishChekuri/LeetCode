class Solution {
    //static HashSet<Integer> hs=new HashSet<>();
    public boolean isHappy(int n) {
        return check(n,new HashSet<>());
    }
    public boolean check(int n,HashSet<Integer> hs){
        if(n==1) return true;
        else if(hs.contains(n)) return false;
        hs.add(n);
        int next=0;
        while(n>0){
            next+=(n%10)*(n%10);
            n/=10;
        }
        return check(next,hs);
    }
}