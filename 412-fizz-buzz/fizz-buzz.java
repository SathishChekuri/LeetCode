class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fruits =new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0) fruits.add("FizzBuzz");
            else if (i%3==0) fruits.add("Fizz");
            else if(i%5==0) fruits.add("Buzz");
            else fruits.add(String.valueOf(i));
        }
        return fruits;
    }
}