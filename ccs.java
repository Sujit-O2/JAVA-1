import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ccs {
    
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> hh=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hh.contains(nums[i])){
                return true;
            }
            hh.add(nums[i]);
        }
        return false;
        
    }
}