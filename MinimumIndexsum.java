import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> idx2 = new HashMap<>();
        for (int j = 0; j < list2.length; j++) idx2.put(list2[j], j); 

        List<String> res = new ArrayList();
        int best = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            Integer j = idx2.get(list1[i]); 
            if (j == null) continue;
            int sum = i + j;
            if (sum < best) {                         
                best = sum;
                res.clear();
                res.add(list1[i]);
            } else if (sum == best) {                 
                res.add(list1[i]);
            }
        }
        return res.toArray(new String[0]);
    }
}
