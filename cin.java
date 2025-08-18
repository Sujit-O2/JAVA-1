import java.util.HashMap;
import java.util.Map;

public class cin {
    public static void main(String[] args) {
        int a[]={1,2,3,1};
        System.out.println(new Solution().containsNearbyDuplicate(a,3));
    }
    
}

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> last index
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                System.out.println("Duplicate found: " + nums[i] + " at indices " + map.get(nums[i]) + " and " + i);
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
