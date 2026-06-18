class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry=0;
        int i=num.length-1;
        while(i>=00&&(k>0||carry>0)){
            if(k>0){
                num[i]+=k%10+carry;
                k/=10;
                carry=num[i]/10;
                 num[i]%=10;
            }
            else if(carry>0){
                num[i]+=carry;
                 carry=num[i]/10;
                num[i]%=10;
            }
            i--;
        }
        k+=carry;
        ArrayList<Integer> ar=new ArrayList<>();
        while(k>0){
            ar.add(0,k%10);
            k/=10;
        }
        for(int j:num) ar.add(j);
        return ar;
    }
}