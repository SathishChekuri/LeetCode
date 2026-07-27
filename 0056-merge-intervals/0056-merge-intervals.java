class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int []> ar=new ArrayList<>();
        int st=intervals[0][0],end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int arr[]=intervals[i];
            if(end>=arr[0]){
                end=Math.max(end,arr[1]);
            }
            else{
                ar.add(new int[]{st,end});
                st=arr[0];
                end=arr[1];
            }
        }
        ar.add(new int[]{st,end});
        int a[][]=new int[ar.size()][];
        int i=0;
        for(int val[]:ar) a[i++]=val;
        return a;
    }
}