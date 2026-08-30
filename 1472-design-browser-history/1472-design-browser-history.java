class BrowserHistory {
    ArrayList<String> ar;
    int c=0;
    public BrowserHistory(String homepage) {
        ar=new ArrayList<>();
        ar.add(homepage);
        
    }
    
    public void visit(String url) {
        ar.add(c+1,url);
        c++;
       for(int i=c+1;i<ar.size();) ar.remove(i);
       System.out.println(ar.toString());
    }
    
    public String back(int steps) {
        if(c-steps<0){
            c=0;
        }
        else c-=steps;
        return ar.get(c);
    }
    
    public String forward(int steps) {
        if(c+steps>ar.size()-1){
            c=ar.size()-1;
        }
        else c+=steps;
        return ar.get(c);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */