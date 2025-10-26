import java.util.PriorityQueue;

public class KthlargestNo {
    
}
class KthLargest {
    PriorityQueue<Integer>as=new PriorityQueue<>();
    int k; 

    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int num:nums){
            as.offer(num);
            if(as.size()>k){
                as.poll();
            }
        }
        
    }
    
    public int add(int val) {
        as.offer(val);
        as.poll();
        return as.peek()
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */