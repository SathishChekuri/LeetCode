class Solution {
    public String destCity(List<List<String>> paths) {
        for(List<String> l:paths){
            int flag=0;
            for(List<String> l1:paths){
                if(l1.get(0).equals(l.get(1))){
                    flag=1;
                    break;
                }
            };
            if(flag==0) return l.get(1);
        }
        return "";
    }
}