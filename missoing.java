import java.lang.reflect.Array;
import java.util.Arrays;

public class missoing {
    
}
class Solution {
    public int missingNumber(int[] nums) {
        int a=0;
        Arrays.sort(nums);
        while(a<nums.length){
            if(a!=nums[a])
            return a;
            a++;
        }
         return a;
    }
}