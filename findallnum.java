import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findallnum {
    
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int a=nums.length;
        HashSet<Integer> sh=new HashSet<>();
        for (int num : nums) {
            sh.add(num);
        }
        List<Integer> result = new ArrayList();
        for (int i = 1; i <= a; i++) {
            if (!sh.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}