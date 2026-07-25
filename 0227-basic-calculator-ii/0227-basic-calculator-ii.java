class Solution {
    public int calculate(String s) {
        Stack<Integer> operand=new Stack<>();
        Stack<Character> operator=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') continue;
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                int num=0;
                while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    num=num*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                operand.push(num);
            }
            else{
                while(!operator.isEmpty()&&prd(operator.peek())>=prd(s.charAt(i))){
                    char c=operator.pop();
                    int b=operand.pop();
                    int a=operand.pop();
                    switch(c){
                        case '+':operand.push(a+b);
                        break;
                        case '-':operand.push(a-b);
                        break;
                        case '*':operand.push(a*b);
                        break;
                        case '/': operand.push(a/b);
                        break;
                        default:
                    }
                }
                operator.push(s.charAt(i));
            }
        }
        while(!operator.isEmpty()){
            char c=operator.pop();
                    int b=operand.pop();
                    int a=operand.pop();
                    switch(c){
                        case '+':operand.push(a+b);
                        break;
                        case '-':operand.push(a-b);
                        break;
                        case '*':operand.push(a*b);
                        break;
                        case '/': operand.push(a/b);
                        break;
                        default:
                    }
        }
        return (operand.isEmpty())?-1:operand.peek();
    }
    int prd(char c){
        if(c=='+'||c=='-') return 1;
        else return 2;
    }
}