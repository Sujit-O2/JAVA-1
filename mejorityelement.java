import java.util.Arrays;
import java.util.HashMap;

public class mejorityelement {
    
}
class Solution {
    public int majorityElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int a=0;

        Arrays.sort(nums);
        HashMap<Integer,Integer> hh=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hh.put(nums[i],hh.getOrDefault(nums[i],0)+1);
        }
        for(Integer i:hh.keySet()){
           if(max>=hh.get(i)){
             max=hh.get(i);
             a=i;
           }
            
            
        }
        if(max>=nums.length/2){
            
            return a;
        }else{
            return 0;
        }

        
    }
}