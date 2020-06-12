import java.util.*;

class MinStack {
    public Stack<Integer> stack; //The initial stack
    public Stack<Integer> min;  // The MinStack, used to store the minimum of the stack, the top item will always be the minimum.

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
        if(min.empty()||min.peek()>=x){
            min.push(x);
        }
    }
    
    public void pop() {
        int x = stack.pop();
        if(!min.empty() && min.peek()==x)
            min.pop();
    }
    
    public int top() {
        if(!stack.empty())
            return stack.peek();
        else
            return 0;
    }
    
    public int getMin() {
        if(!min.empty()){
            return min.peek();
        }else{
            return 0;
        }
    }    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
