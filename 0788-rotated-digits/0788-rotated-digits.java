class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i=2;i<=n;i++){
            int num=i;
            boolean valid=true;
            boolean rotate=false;
            while(num>0){
                int d=num%10;
                num/=10;
                if(d==3||d==7||d==4){
                    valid=false;
                    break;
                }
                else if(d==2||d==5||d==6||d==9){
                    rotate=true;
                }
            }
            if(valid&&rotate) c++;
        }
        return c;
    }
}