class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mindif=Integer.MAX_VALUE;
        List<List<Integer>> res=new  ArrayList<>();
        for(int i=1;i<arr.length;i++){
            int dif=arr[i]-arr[i-1];
            if(dif<mindif){
                mindif=dif;
                res=new ArrayList<>();
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if(dif==mindif){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
            }
     return res;
    }
}