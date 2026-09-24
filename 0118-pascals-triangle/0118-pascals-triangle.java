class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ar=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        ar.add(arr);
        while(--numRows>0){
            arr=new ArrayList<>();
            List<Integer> temp=ar.get(ar.size()-1);
            int sz=temp.size()+1;
            for(int i=0;i<sz;i++){
                if(i==0||i==sz-1)  arr.add(1);
                else arr.add(temp.get(i)+temp.get(i-1));
            }
            ar.add(arr);
        }
        return ar;
    }
}