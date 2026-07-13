class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ar=new ArrayList<>();
        int d=2;
        while(d<10){
            int c=1;
            int x=0;
            int t=d;
            int diff=0;
            while(t-->0){
                x=(x*10)+c;
                c++;
                diff=(diff*10)+1;
            }
            for(int i=0;i<10-d;i++){
                ar.add(x);
                x+=diff;
            }
            d++;
        }
        List<Integer> arr=new ArrayList<>();
        for(int i:ar){
            if(low<=i&&high>=i) arr.add(i);
        }
        return arr;
    }
}