import java.util.ArrayList;
import java.util.List;

public class StackToQueue {

    
}
class MyStack {
 ArrayList<Integer> a1=new ArrayList<>();
    public MyStack() {
        
        
    }
    public void push(int x) {
        a1.add(x);
        
    }
    
    public int pop() {
       
         return a1.remove(a1.size()-1);

        
    }
    
    public int top() {
        return a1.get(a1.size()-1);
        
    }
    
    public boolean empty() {
        return a1.isEmpty();
        
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