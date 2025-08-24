import java.util.ArrayList;
import java.util.List;

public class pathaa {
    
}

   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      } }


class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;

        traverse(root, "", result);
        return result;
    }

    private void traverse(TreeNode node, String path, List<String> result) {
        if (node == null) return;

        if (!path.isEmpty()) {
            path += "->";
        }
        path += node.val;

        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        traverse(node.left, path, result);
        traverse(node.right, path, result);
    }
}
