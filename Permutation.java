import java.util.*;
public class Permutation {
    
}


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, used, path, res);
        return res;
    }

    private void dfs(int[] nums, boolean[] used, Deque<Integer> path, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.addLast(nums[i]);
            dfs(nums, used, path, res);
            path.removeLast();
            used[i] = false;
        }
    }
}
