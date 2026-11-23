class ProductOfNumbers {
    ArrayList<Integer> ar;
    public ProductOfNumbers() {
        ar=new ArrayList<>();
    }
    
    public void add(int num) {
        ar.add(num);
    }
    
    public int getProduct(int k) {
        int i=Math.max(0,ar.size()-k);
        int prd=1;
        while(i<ar.size()){
            prd*=ar.get(i);
            i++;
        }
        return prd;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */