class Solution {
    public int[][] merge(int[][] intervals) {
        List<int []> arr=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int pa=intervals[0][0];
        int pb=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int [] ar=intervals[i];
            if(pb>=ar[0]){
                pb=Math.max(ar[1],pb);
                    continue;
            }
            else {
                arr.add(new int[]{pa,pb});
                pa=ar[0];
                pb=ar[1];
            }
        }
        arr.add(new int[]{pa,pb});
        return arr.toArray(new int[arr.size()][]);
    }
}