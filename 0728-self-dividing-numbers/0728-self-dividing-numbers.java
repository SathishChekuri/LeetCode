class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ar=new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean selfdnum=true;
            int t=i;
            while(t>0){
                if((t%10==0)||i%(t%10)!=0){
                    selfdnum=false;
                    break;
                }
                t/=10;
            }
            if(selfdnum) ar.add(i);
        }
        return ar;
    }
}