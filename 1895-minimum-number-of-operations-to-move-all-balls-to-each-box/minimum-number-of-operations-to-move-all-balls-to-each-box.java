class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int arr[]=new int[n];
        int ps=0;
        int pc=0;
        for(int i=0;i<n;i++){
            arr[i]=i*pc-ps;
            if(boxes.charAt(i)=='1'){
                pc++;
                ps+=i;
            }
        }
        int sc=0,ss=0;
        for(int i=n-1;i>=0;i--){
            arr[i]+=ss-sc*i;
            if(boxes.charAt(i)=='1'){
                sc++;
                ss+=i;
            }
        }
        return arr;
    }
}