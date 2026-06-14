class Solution {
    public int[] plusOne(int[] digits) {
        boolean next=false;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            else{
                digits[i]=0;
                next=true;
            }
        }
        if(next){
            List<Integer> arr=new ArrayList<>();
            for(int i:digits){
                arr.add(i);
            }
            arr.add(0,1);
            int ar[]=new int[arr.size()];
            for(int i=0;i<ar.length;i++){
                ar[i]=arr.get(i);
            }
            return ar;
        }
        return digits;
    }
}