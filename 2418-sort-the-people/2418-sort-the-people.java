class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        Map<Integer,String> mapping=new HashMap<>();
        for(int i=0;i<n;i++) mapping.put(heights[i],names[i]);
        Arrays.sort(heights);
        for(int i=0;i<n;i++){
            names[i]=mapping.get(heights[n-i-1]);
        }
        return names;
    }
}