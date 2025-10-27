import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyHeapSet {
    
}
class MyHashSet {
    List<Integer> la;

    public MyHashSet() {
        la=new ArrayList<>();
        
    }
    
    public void add(int key) {
        if(!la.contains(key))
        la.add(key);
        
    }
    
    public void remove(int key) {
        int a=la.indexOf(key);
        if(a>=0){
        la.remove(la.indexOf(key));
        }
        
    }
    
    public boolean contains(int key) {
        return la.contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */