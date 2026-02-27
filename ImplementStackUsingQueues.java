//https://leetcode.com/problems/implement-stack-using-queues/?envType=problem-list-v2&envId=design
import java.util.ArrayList;

class MyStack {

    ArrayList<Integer> stack = new ArrayList<Integer>();

    public MyStack() {}

    
    public void push(int x) {

        stack.add(0, x);
        
    }
    
    public int pop() {

        Integer aux = stack.get(0);
        stack.remove(0);
        return (int)aux;
        
    }
    
    public int top() {

        return (int)stack.get(0);
        
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
