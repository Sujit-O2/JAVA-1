import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicate {
    
}
class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        int a[]=new int[nums.length];
        for(int i:nums){
            if(!(map.getOrDefault(i,0)>1)){
                map.put(i,map.getOrDefault(i,0)+1);
                a[count]=i;
                count++;
            }
        }
        for(int i=0;i<count;i++){
            nums[i]=a[i];
        }
        return count;


        
    }
}