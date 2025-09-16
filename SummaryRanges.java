import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();
        if (nums.length == 0) return ls;

        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    ls.add(String.valueOf(start));
                } else {
                    ls.add(start + "->" + nums[i - 1]);
                }
                start = nums[i]; 
            }
        }

        if (start == nums[nums.length - 1]) {
            ls.add(String.valueOf(start));
        } else {
            ls.add(start + "->" + nums[nums.length - 1]);
        }

        return ls;
    }
}
