//https://leetcode.com/problems/implement-queue-using-stacks/?envType=problem-list-v2&envId=design
import java.util.ArrayList;

class MyQueue {

    ArrayList<Integer> stackFIFO = new ArrayList<Integer>(); 

    public MyQueue() {}
    
    public void push(int x) {

        stackFIFO.add(0, x);
        
    }
    
    public int pop() {

        Integer aux = stackFIFO.get((stackFIFO.size() - 1));
        stackFIFO.remove((stackFIFO.size() - 1));
        return (int)aux;

    }
    
    public int peek() {

        return (int)stackFIFO.get((stackFIFO.size() - 1));
        
    }
    
    public boolean empty() {

        return stackFIFO.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
