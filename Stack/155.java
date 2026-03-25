class MinStack {

    class pair {
        int val;
        int min;

        pair(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
    Stack<pair> s;
    public MinStack() {
         s = new Stack<>();
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push(new pair(val, val));
        }
        else {
            int minVal = Math.min(val, s.peek().min);
            s.push(new pair(val, minVal));
        }

    }
    
    public void pop() {
        if(!s.isEmpty()) {
            s.pop();
        }
    }
    
    public int top() {
        return s.peek().val;
    }
    
    public int getMin() {
         return s.peek().min;
    }
}