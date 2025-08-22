import java.util.ArrayList;

public class Queueusingstack {
    
}
class MyQueue {
 ArrayList<Integer> a1=new ArrayList<>();
    public MyQueue() {
        
        
    }
    public void push(int x) {
        a1.add(x);
        
    }
    
    public int pop() {
       
         return a1.remove(0);

        
    }
    
    public int top() {
        return a1.get(a1.size()-1);
        
    }
    
    public boolean empty() {
        return a1.isEmpty();
        
    }
    public int peek(){
        return a1.get(0);
    }
}

