class Solution {
    int t=1;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<n;i++) ar.add(new ArrayList<>());
        for(List<Integer> arr:connections){
            ar.get(arr.get(0)).add(arr.get(1));
            ar.get(arr.get(1)).add(arr.get(0));
        }
        int lt[]=new int[n];
        int ct[]=new int[n];
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ct[i]==0) dfs(i,-1,ar,ans,ct,lt);
        }
        return ans;
    }
    void dfs(int curr,int parent,ArrayList<ArrayList<Integer>> ar,List<List<Integer>> ans,int [] ct,int lt[]){
        ct[curr]=lt[curr]=t;
        t++;
        for(int child:ar.get(curr)){
            if(child==parent) continue;
            if(ct[child]!=0){
                lt[curr]=Math.min(lt[curr],lt[child]);
                continue;
            }
            dfs(child,curr,ar,ans,ct,lt);
            lt[curr]=Math.min(lt[curr],lt[child]);
            if(lt[child]>ct[curr]){
                List<Integer> temp=new ArrayList<>();
                temp.add(child);
                temp.add(curr);
                ans.add(temp);
            }
        }
    }
}