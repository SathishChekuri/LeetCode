class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        Map<Integer,String> mapping=new HashMap<>();
        for(int i=0;i<n;i++) mapping.put(heights[i],names[i]);
        Arrays.sort(heights);
        for(int i=0;i<n/2;i++){
            int t=heights[i];
            heights[i]=heights[n-1-i];
            heights[n-i-1]=t;
        }
        for(int i=0;i<n;i++){
            names[i]=mapping.get(heights[i]);
        }
        return names;
    }
}