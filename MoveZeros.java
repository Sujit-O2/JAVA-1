import java.util.ArrayList;

public class MoveZeros {
    
}
class Solution {
    public void moveZeroes(int[] nums) {
        
        ArrayList<Integer> ll=new ArrayList<>();
        for(int n:nums){
            if(n==0){
               
            }
            else{
                ll.add(n);
            }
        }
        for(int i=0;i<ll.size();i++){
            nums[i]=ll.get(i);
        }
        for(int i=ll.size();i<nums.length;i++){
            nums[i]=0;

        }
        
    }
}