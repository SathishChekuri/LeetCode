class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n=accounts.size();
        int parent[]=new int[n];
        for(int i=0;i<n;i++) parent[i]=i;
        HashMap<String,Integer> hs=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String key=accounts.get(i).get(j);
               if(!hs.containsKey(key)) hs.put(key,i);
               else{
                int u=find(parent[i],parent);
                int v=find(parent[hs.get(key)],parent);
                if(u==v) continue;
                 if(u>v) parent[u]=v;
                 else parent[v]=u;
                // parent[i]=find(parent[hs.get(key)],parent);
               }
            }
        }
        List<List<String>> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            temp.add(new ArrayList<>());
            temp.get(i).add(accounts.get(i).get(0));
        }
        for(Map.Entry<String,Integer> t:hs.entrySet()){
            temp.get(find(parent[t.getValue()],parent)).add(t.getKey());
        }
        for(int i=0;i<temp.size();){
            List<String> ar=temp.get(i);
            if(ar.size()==1) temp.remove(ar);
            else{
                String name=ar.remove(0);
                Collections.sort(ar);
                ar.add(0,name);
                i++;
            }
        }
        return temp;
    }
    int find(int i,int [] parent){
        if(i==parent[i]) return i;
        parent[i]=find(parent[i],parent);
        return parent[i];
    }
}