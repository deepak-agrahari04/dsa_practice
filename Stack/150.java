class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num = new Stack<>();
        int n = tokens.length;
        for(int i = 0; i < n; i++){
            String token = tokens[i];
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int num1 = num.pop();
                int num2 = num.pop();
                int result = 0;
            
                switch(token){
                    case "+":
                       result = num2 + num1;
                       break;
                    case "-":
                       result = num2 - num1;
                       break;
                    case "*":
                       result = num2 * num1;
                       break;
                    case "/":
                       result = num2 / num1;
                       break;
                }
                num.push(result);
            }
            
            else{
                num.push(Integer.parseInt(token));
            }
        }
        return num.pop();
    }
}