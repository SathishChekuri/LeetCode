class Solution {
    public int totalNumbers(int[] digits) {
        boolean [] ans=new boolean[1000];
        int c=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<digits.length;j++){
                if(i==j) continue;
                for(int k=0;k<digits.length;k++){
                    if(i==k||j==k||digits[k]%2==1) continue;
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    if(!ans[num]){
                        c++;
                        ans[num]=true;
                    }
                }
            }
        }
        return c;
    }
}