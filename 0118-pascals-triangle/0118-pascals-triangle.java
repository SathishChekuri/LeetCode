class Solution {
    List<Integer> newrow(int n){
        int res=1;
        List<Integer> ls=new ArrayList<>();
        ls.add(res);
        for(int i=1;i<n;i++){
            res*=(n-i);
            res/=i;
            ls.add(res);
        }
        return ls;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            lst.add(newrow(i));
        }
        return lst;
    }
}