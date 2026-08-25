class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int [] Indegree=new int[numCourses];
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<numCourses;i++) ar.add(new ArrayList<>());
        for(int [] arr:prerequisites){
            ar.get(arr[0]).add(arr[1]);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            for(int j:ar.get(i)) Indegree[j]++;
        }
        int c=0;
        for(int i=0;i<numCourses;i++){
            if(Indegree[i]==0){
                q.add(i);
                c++;
            }
        }
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int i:ar.get(curr)){
                Indegree[i]--;
                if(Indegree[i]==0){
                    q.add(i);
                    c++;
                }
            }
        }
        return c==numCourses;
    }
}